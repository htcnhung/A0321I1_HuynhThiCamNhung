package services.impl;

import controllers.FuramaController;
import models.Booking;
import models.Customer;
import services.CustomerService;
import utils.ReadAndWriteFile;
import utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    private static final String NAME_CUSTOMER_REGEX= "^(([A-Z][a-z]+)(| ))+$";
    private static final String EMAIL_CUSTOMER_REGEX = "^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$";
    private static final String CMND_CUSTOMER_REGEX = "^([0-9]{3}\\s){2}[0-9]{3}$";
    private static final String GENDER_CUSTOMER_REGEX = "^[nN][aA][mM]|[nN][uU]|[uU][nN][kK][nN][oO][wW]$";
    private static final String PHONE_NUMBER_REGEX = "^0([0-9]{9})$";
    private static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[/](0[1-9]|1[012]))|((29|30|31)[/]" +
            "(0[13578]|1[02]))|((29|30)[/](0[4,6,9]|11)))[/](19\\d\\d|200[0-1])$)|(^29[/]02[/]((19)" +
            "(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|2000)$)";

    @Override
    public void display() {
        customerList = (List<Customer>) ReadAndWriteFile.read("D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\customer.csv");
        if (customerList == null) {
            customerList = new LinkedList<>();
            System.out.println("Danh sách khách hàng hiện đang trống, hãy thêm một khách hàng mới!");
            FuramaController.displayCustomerManagement();
        } else {
            System.out.println("Danh sách khách hàng hiện có là: ");
            for (Customer customer : customerList) {
                System.out.println(customer.toString());
            }
        }
        FuramaController.displayCustomerManagement();
    }

    @Override
    public void addNew() {
        System.out.println("Nhập ID Customer: ");
        int id = Integer.parseInt(scanner.nextLine());
        String name = inputName();
        System.out.println("Nhập ngày tháng năm sinh Customer: ");
        String age = RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX);
        System.out.println("Nhập địa chỉ Customer: ");
        String address = scanner.nextLine();
        String gender = inputGender();
        System.out.println("Nhập ID CMND:");
        String identityCardNumber = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        String email = inputEmail();
        System.out.println("Nhập loại khách hàng: ");
        String customerType = scanner.nextLine();
        Customer customer = new Customer();
        customerList.add(customer);
        System.out.println("Đã thêm thông tin khách hành thành công!");
        ReadAndWriteFile.write(customerList, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\customer.csv");
        FuramaController.displayCustomerManagement();
    }
    private String inputName(){
        System.out.println("Nhập tên nhân viên:");
        return RegexData.regexStr(scanner.nextLine(),NAME_CUSTOMER_REGEX, "Bạn đã nhập sai định dang, tên phải viết hoa chữ cái đầu tiên!" );
    }
    private String inputEmail(){
        System.out.println("Nhập email:");
        return RegexData.regexStr(scanner.nextLine(),EMAIL_CUSTOMER_REGEX, "Bạn đã nhập sai định dang, ví dụ: abc@gmail.com" );
    }
    private String inputGender(){
        System.out.println("Nhập giới tính:");
        return RegexData.regexStr(scanner.nextLine(),GENDER_CUSTOMER_REGEX, "Bạn đã nhập sai định dang, ví dụ: N(n)am, N(n)u, U(u)nknow" );
    }

    @Override
    public void edit() {
        if (customerList == null) {
            System.out.println("Danh sách khách hàng hiện đang trống, hãy thêm khách hàng!");
            FuramaController.displayCustomerManagement();
            boolean check = false;
            System.out.println("Nhập ID Customer muốn sửa: ");
            for (Customer customer : customerList) {
                if (customer.getId() == scanner.nextInt()) {
                    System.out.println("Thông tin khách hàng bạn muốn sửa là: " + customer.toString());
                    System.out.println("Nhập ID Customer mới: ");
                    customer.setId(Integer.parseInt(scanner.nextLine()));
                    customer.setName(inputName());
                    System.out.println("Nhập ngày tháng năm sinh mới: ");
                    customer.setAge(RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX));
                    System.out.println("Nhập địa chỉ mới: ");
                    customer.setAddress(scanner.nextLine());
                    customer.setGender(inputGender());
                    System.out.println("Nhập ID CMND mới:");
                    customer.setIdentityCardNumber(scanner.nextLine());
                    System.out.println("Nhập số điện thoại mới: ");
                    customer.setPhoneNumber(scanner.nextLine());
                    customer.setEmail(inputEmail());
                    System.out.println("Nhập loại khách hàng mới: ");
                    customer.setCustomerType(scanner.nextLine());
                    ReadAndWriteFile.write(customerList, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\customer.csv");
                    check = true;
                    break;
                }
                if (!check) {
                    System.out.println("Không tìm thấy ID khách hàng bạn vừa nhập!");
                    edit();
                } else {
                    System.out.println("Đã cập nhật thông tin khách hàng!");
                }
            }
            display();
            FuramaController.displayCustomerManagement();
        }

    }


}

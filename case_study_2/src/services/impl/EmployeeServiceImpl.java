package services.impl;

import controllers.FuramaController;
import models.Booking;
import models.Employee;
import services.EmployeeService;
import utils.ReadAndWriteFile;
import utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
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
        employeeList = (List<Employee>) ReadAndWriteFile.read("D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\employee.csv");
        if (employeeList == null) {
            employeeList = new ArrayList<>();
            System.out.println("Danh sách nhân viên hiện đang trống, hãy thêm một nhân viên mới!");
            FuramaController.displayEmployeeManagement();
        } else {
            System.out.println("Danh sách nhân viên hiện có là: ");
            for (Employee employee : employeeList) {
                System.out.println(employee.toString());
            }
        }
        FuramaController.displayEmployeeManagement();
    }

    @Override
    public void addNew() {
        System.out.println("Nhập ID Employee: ");
        int id = Integer.parseInt(scanner.nextLine());
        String name = inputName();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String age = RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX);
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        String gender = inputGender();
        System.out.println("Nhập ID CMND:");
        String identityCardNumber = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        String email = inputEmail();
        System.out.println("Nhập trình độ: ");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, address, gender, identityCardNumber, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
        ReadAndWriteFile.write(employeeList, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\employee.csv");
        System.out.println("Đã thêm mới nhân viên thành công!");
        FuramaController.displayEmployeeManagement();
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
        employeeList = (List<Employee>) ReadAndWriteFile.read("D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\employee.csv");
        if (employeeList == null) {
            System.out.println("Danh sách nhân viên trống, hãy thêm nhân viên!");
            FuramaController.displayEmployeeManagement();
        } else {
            boolean check = false;

            System.out.println("Nhập ID Employee muốn sửa: ");
            int idEmployee = Integer.parseInt(scanner.nextLine());
            for (Employee employee : employeeList) {
                if (employee.getId() == idEmployee) {
                    System.out.println("Thông tin nhân viên bạn muốn sửa là: " + employee.toString());
                    System.out.println("Nhập ID Employee mới: ");
                    employee.setId(Integer.parseInt(scanner.nextLine()));
                    employee.setName(inputName());
                    System.out.println("Nhập ngày tháng năm sinh mới: ");
                    employee.setAge(RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX));
                    System.out.println("Nhập địa chỉ mới: ");
                    employee.setAddress(scanner.nextLine());
                    employee.setGender(inputGender());
                    System.out.println("Nhập ID CMND mới:");
                    employee.setIdentityCardNumber(scanner.nextLine());
                    System.out.println("Nhập số điện thoại mới: ");
                    employee.setPhoneNumber(scanner.nextLine());
                    employee.setEmail(inputEmail());
                    System.out.println("Nhập trình độ mới: ");
                    employee.setLevel(scanner.nextLine());
                    System.out.println("Nhập vị trí mới: ");
                    employee.setPosition(scanner.nextLine());
                    System.out.println("Nhập lương mới: ");
                    employee.setSalary(Integer.parseInt(scanner.nextLine()));
                    ReadAndWriteFile.write(employeeList, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\employee.csv");
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Không tìm thấy ID nhân viên bạn vừa nhập!");
                edit();
            } else {
                System.out.println("Đã cập nhật thông tin nhân viên!");
            }
            display();
            FuramaController.displayEmployeeManagement();
        }
    }

}

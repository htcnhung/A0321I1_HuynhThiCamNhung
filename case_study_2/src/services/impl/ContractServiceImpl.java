package services.impl;

import controllers.FuramaController;
import models.Booking;
import models.Contract;
import models.Customer;
import services.ContractService;
import utils.BookingComparator;
import utils.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    List<Contract> contractList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    public Set<Booking> bookingList = BookingServiceImpl.bookingSet;
    public List<Customer> customers = CustomerServiceImpl.customerList;


    @Override
    public void display() {
        contractList = (List<Contract>) ReadAndWriteFile.read("D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\contract.csv");
        if (contractList == null) {
            contractList = new ArrayList<>();
            System.out.println("Danh sách hợp đồng hiện đang trống, hãy thêm mới một hợp đồng!");
            FuramaController.displayBookingManagerment();
        } else {
            for (Contract contract : contractList) {
                System.out.println(contract.toString());
            }
        }

    }

    @Override
    public void addNew() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer.toString());
            System.out.println("Nhập ID hợp đồng:");
            int contractID = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số tiền cọc:");
            String deposit = scanner.nextLine();
            System.out.println("Nhập tổng số tiền:");
            String totalAmount = scanner.nextLine();
            Contract contract = new Contract(contractID, booking, deposit, totalAmount, customer);
            contractList.add(contract);
            ReadAndWriteFile.write(contractList, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\contract.csv");
            System.out.println("Đã tạo hợp đồng thành công!");

        }
    }

    @Override
    public void edit() {
        if (contractList.isEmpty()) {
            System.out.println("Danh sách hợp đồng đang trống, hãy thêm mới hợp đồng!");
            FuramaController.displayBookingManagerment();
        } else {
            boolean check = true;
            System.out.println("Nhập ID contract muốn sửa: ");
            int editID = scanner.nextInt();
            for (Contract contract : contractList) {
                if (contract.getContractID() == editID) {
                    System.out.println("Thông tin khách hàng bạn muốn sửa là: ");
                    contract.toString();
                    System.out.println("Nhập ID contract mới: ");
                    contract.setContractID(Integer.parseInt(scanner.nextLine()));
                    Booking booking = chooseBooking();
                    contract.setBooking(booking);
                    System.out.println("Nhập số tiền depossit: ");
                    contract.setDeposit(scanner.nextLine());
                    System.out.println("Nhập số tiền total amount: ");
                    contract.setTotalAmount(scanner.nextLine());
                    Customer customer = BookingServiceImpl.chooseCustomer();
                    contract.setCustomer(customer);
                    ReadAndWriteFile.write(contractList, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\contract.csv");
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("Đã sửa hợp đồng thành công!");
            }
        }
    }

    //Tạo phương thức để chọn booking đang có
    public Booking chooseBooking() {
        System.out.println("Danh sách booking hiện có: ");
        for (Booking booking : bookingList) {
            System.out.println(booking.toString());
        }
        System.out.println("Chọn ID booking:");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Booking booking : bookingList) {
                if (id == booking.getBookingID()) {
                    check = false;
                    return booking;
                }
            }
            if (check) {
                System.out.println("Không tìm thấy ID booking, vui lòng thử lại!");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

}

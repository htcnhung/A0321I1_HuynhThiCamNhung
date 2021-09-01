package services.impl;

import controllers.FuramaController;
import models.Booking;
import models.Customer;
import models.Facility;
import services.BookingService;
import utils.BookingComparator;
import utils.ReadAndWriteFile;

import java.util.*;

public class BookingServiceImpl implements BookingService {


    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        bookingSet = (Set<Booking>) ReadAndWriteFile.read("D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\booking.csv");
        if (bookingSet == null) {
            bookingSet = new TreeSet<>(new BookingComparator());
            System.out.println("Danh sách booking hiện đang trống, hãy thêm mới booking!");
            addNew();
        } else {

            for (Booking booking : bookingSet) {
                System.out.println(booking.toString());
            }
        }

    }

    @Override
    public void addNew() {
        System.out.println("Nhập ID Booking:");
        int id = Integer.parseInt(scanner.nextLine());
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày check in:");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày check out:");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookingSet.add(booking);
        ReadAndWriteFile.write(bookingSet, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\booking.csv");
        System.out.println("Đã thêm mới booking thành công!");


    }

    @Override
    public void edit() {
        if (bookingSet == null) {
            System.out.println("Danh sách booking hiện đang trống, hãy thêm booking!");
            FuramaController.displayBookingManagerment();
            boolean check = false;
            System.out.println("Nhập ID Booking muốn sửa: ");
            for (Booking booking : bookingSet) {
                if (booking.getBookingID() == scanner.nextInt()) {
                    System.out.println("Thông tin booking bạn muốn sửa là: " + booking.toString());
                    booking.getCustomer();

                    System.out.println("Nhập ID booking mới: ");
                    booking.setBookingID(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập ngày check in mới: ");
                    booking.setStartDate(scanner.nextLine());
                    System.out.println("Nhập ngày check out mới: ");
                    booking.setEndDate(scanner.nextLine());


                    check = true;
                    break;
                }
                if (!check) {
                    System.out.println("Không tìm thấy ID khách hàng bạn vừa nhập!");
                    edit();
                } else {
                    System.out.println("Đã cập nhật thông tin khách hàng!");
                    ReadAndWriteFile.write(bookingSet, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\booking.csv");
                }
            }
            display();
            FuramaController.displayCustomerManagement();
        }

    }

    //Tạo phương thức để chọn customer đang có
    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng hiện có: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Chọn ID khách hàng:");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Không tìm thấy ID khách hàng, vui lòng thử lại!");
                id = Integer.parseInt(scanner.nextLine());
                FuramaController.displayMainMenu();
            }
        }
        return null;
    }

    //Tạo phương thức để chọn dịch vụ có sẵn
    public static Facility chooseFacility() {
        System.out.println("Danh sách dịch vụ hiện có: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Chọn ID dịch vụ:");
        boolean check = true;
        boolean checkFacility = true;
        String id = scanner.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (Integer.parseInt(id) == (entry.getKey().getServiceID())) {
                    checkFacility = false;
                    return entry.getKey();
                }
            }
            if (checkFacility) {
                System.out.println("Không tìm thấy ID dịch vụ, vui lòng thử lại!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    //Phương thức trả về setBooing;
    public static Set<Booking> sendBooking() {
        return bookingSet;
    }


}

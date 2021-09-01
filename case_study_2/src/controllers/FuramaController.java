package controllers;

import services.CustomerService;
import services.impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    //Xây dựng menu chương trình tổng quát
    public static void displayMainMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to Furama Resort! \n" +
                    "Please press '1' for Employee Management\n" +
                    "Please press '2' for Customer Management\n" +
                    "Please press '3' for Facility Management\n" +
                    "Please press '4' for Booking Managerment\n" +
                    "Please press '5' For Promotion Management\n" +
                    "Please press '6' to exit\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagerment();
                case 5:
                    displayPromotionManagement();
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        }
    }

    //Menu con của chức năng số 1 Employee Management
    public static void displayEmployeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to Employee Management Menu! \n" +
                    "Please press '1' to display list employees\n" +
                    "Please press '2' to add new employee\n" +
                    "Please press '3' to edit employee\n" +
                    "Please press '4' to return main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayEmployeeManagement();
            }
        }
    }


    //Menu con của chức năng số 2 Customer Management
    public static void displayCustomerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to Customer Management Menu! \n" +
                    "Please press '1' to display list customers\n" +
                    "Please press '2' to add new customer\n" +
                    "Please press '3' to edit customer\n" +
                    "Please press '4' to return main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayCustomerManagement();
            }
        }
    }

    //Menu con của chức năng số 3 Facility Management
    public static void displayFacilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to Facility Management Menu! \n" +
                    "Please press '1' to display list facility\n" +
                    "Please press '2' to add new facility\n" +
                    "Please press '3' to display list facility maintenance\n" +
                    "Please press '4' to return main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayFacilityManagement();
            }
        }
    }

    //Thanh menu con trong chức năng Add new facility
    public static void addNewFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Add new facility: \n" +
                    "Please press '1' to add new villa\n" +
                    "Please press '2' to add new house\n" +
                    "Please press '3' to add new room\n" +
                    "Please press '4' to return menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    displayFacilityManagement();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    addNewFacility();
            }
        }
    }

    //Menu con của chức năng số 4 Booking Managerment
    public static void displayBookingManagerment() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to Booking Managerment Menu! \n" +
                    "Please press '1' to add new booking\n" +
                    "Please press '2' to display list booking\n" +
                    "Please press '3' to create new constracts\n" +
                    "Please press '4' to display list contracts\n" +
                    "Please press '5' to edit contracts\n" +
                    "Please press '6' to return main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    bookingService.addNew();
                    break;
                case 2:
                    bookingService.display();
                    break;
                case 3:
                    contractService.addNew();
                    break;
                case 4:
                    contractService.display();
                    break;
                case 5:
                    contractService.edit();
                    break;
                case 6:
                    displayMainMenu();
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayBookingManagerment();
            }
        }
    }


    //Menu con của chức năng số 5 Promotion Management
    public static void displayPromotionManagement() {
        boolean check = true;
        while (check) {
            System.out.println("Welcome to Promotion Management Menu! \n" +
                    "Please press '1' to display list customers use service\n" +
                    "Please press '2' to display list customers get voucher\n" +
                    "Please press '3' to return main menu\n");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayPromotionManagement();
            }
        }
    }


}

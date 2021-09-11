package controllers;

import services.BenhAnThuongService;
import services.impl.*;
import sun.applet.Main;

import java.util.Scanner;


public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static Scanner scanner = new Scanner(System.in);

    //Xây dựng menu chương trình tổng quát
    public static void displayMainMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN! \n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các bệnh án\n" +
                    "4. Thoát\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    displayThemBenhAnManagement();
                    break;
                case 2:
                    displayXoaBenhAnManagement();
                    break;
                case 3:
                    displayDanhSachBenhAnManagement();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        }
    }

    private static void displayDanhSachBenhAnManagement() {
        BenhAnVipServiceImpl benhAnVipService = new BenhAnVipServiceImpl();
        BenhAnThuongService benhAnThuongService = new BenhAnThuongServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to benh an Menu! \n" +
                    "Please press '1' to hien thi danh sach benh an thuong\n" +
                    "Please press '2' to hien thi danh sach benh an vip\n"+
                    "Please press '3' to quay lai\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    benhAnThuongService.display();
                    break;
                case 2:
                    benhAnVipService.display();
                    break;
                case 3:
                    MainController.displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayMainMenu();
            }
        }
    }

    private static void displayXoaBenhAnManagement() {
        BenhAnVipServiceImpl benhAnVipService = new BenhAnVipServiceImpl();
        BenhAnThuongService benhAnThuongService = new BenhAnThuongServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to benh an Menu! \n" +
                    "Please press '1' to xoa benh an thuong\n" +
                    "Please press '2' to xoa benh an vip\n" +
                    "Please press '3' quay lai\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    benhAnThuongService.delete();
                    break;
                case 2:
                    benhAnVipService.delete();
                    break;
                case 3:
                    MainController.displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayMainMenu();
            }
        }
    }

    public static void displayThemBenhAnManagement() {
        BenhAnVipServiceImpl benhAnVipService = new BenhAnVipServiceImpl();
        BenhAnThuongService benhAnThuongService = new BenhAnThuongServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Welcome to benh an Menu! \n" +
                    "Please press '1' to add benh an thuong\n" +
                    "Please press '2' to add benh an vip\n" +
                    "Please press '3' quay lai\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (choice) {
                case 1:
                    benhAnThuongService.addNew();
                    break;
                case 2:
                    benhAnVipService.addNew();
                    break;
                case 3:
                    MainController.displayMainMenu();

                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    displayMainMenu();
            }
        }
    }


}

package _1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tỷ giá quy đổi hiện tại: 1 USD = 23,000 VND");
        double rate = 23000;
        System.out.println("Nhập số tiền USD cần quy đổi: ");
        double yourMoney = scanner.nextDouble();
        double result = yourMoney*rate;
        System.out.println(yourMoney+ " USD = " + result + " VND");
    }
}

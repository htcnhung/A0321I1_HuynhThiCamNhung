package _2_looping_statement_in_java.thuc_hanh;

import java.util.Scanner;

public class CheckInterest {
    public static void main(String[] args) {
        //Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tỷ lệ lãi suất/năm là: 1.0");
        double interestRate = 1.0;
        System.out.println("Nhập số tiền bạn muốn gửi: ");
        double yourMoney = scanner.nextDouble();
        System.out.println("Nhập số kỳ hạn bạn muốn gửi: ? tháng: ");
        int month = scanner.nextInt();
        double totalInterset = 0;
        for (int i = 0; i < month; i++) {
            totalInterset += (yourMoney * interestRate) / 12 * month;
        }
        System.out.println("Số tiền lãi của bạn sau khi đáo hạn là: " + totalInterset + " VND");
    }
}

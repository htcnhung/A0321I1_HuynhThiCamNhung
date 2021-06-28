package _2_looping_statement_in_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println("This number is not a prime!");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("This is a prime!");
            } else {
                System.out.println("This is not a prime!");
            }
        }
    }
}

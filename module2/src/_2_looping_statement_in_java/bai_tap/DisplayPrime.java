package _2_looping_statement_in_java.bai_tap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập số lượng số nguyên tố bạn muốn in: ");
            number = sc.nextInt();
        } while (number < 0);
        int count = 0;
        int n = 2;
        boolean check = false;
        while (count < number) {
            for (int i = 2; i<= Math.sqrt(n); i++){
                if (n % i == 0) {
                    check = true;
                    break;
                }
            }
            if (!check){
                count++;
                System.out.print(n + ", ");
            }
            n++;
            check = false;
        }

    }
}

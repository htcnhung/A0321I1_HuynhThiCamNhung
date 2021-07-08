package _3_array_and_methods_in_java.bai_tap;

import java.util.Scanner;

public class TotalOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 29, 50, 43, 0, 9},
                {0, 23, 1939, 8, 2, 48},
                {24, 6, 45, 9, 35, 90},
                {45, 82, 8, 0, 112, 7}
        };
        int column;
        do {
            System.out.println("Bạn muốn tính tổng cột thứ mấy: ");
            column = sc.nextInt();
        } while (column > arr[0].length);


        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][column - 1];
        }
        System.out.println("Tổng cột số " + column + " là: " + total);
    }
}

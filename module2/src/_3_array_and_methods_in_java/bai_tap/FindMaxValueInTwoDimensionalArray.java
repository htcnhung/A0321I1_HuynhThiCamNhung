package _3_array_and_methods_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValueInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng hai chiều: ");
        int row = sc.nextInt();
        System.out.println("Nhập số lượng phần tử trong mẩng con ");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào phần tử ở vị trí array [" + i + "][" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng hai chiều của bạn là: " + Arrays.toString(array));
        //Hỏi thầy cách in mảng hai chiều
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }

}

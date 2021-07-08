package _3_array_and_methods_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Nhập kích thước của mảng: ");
        arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng của bạn là: " + Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}

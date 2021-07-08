package _3_array_and_methods_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập vào phần tư thứ " + (i + 1) + " của mảng 1");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập vào phần tư thứ " + (i + 1) + " của mảng 1");
            arr2[i] = scanner.nextInt();
        }
        int size3 = size1 + size2;
        int[] arr3 = new int[size3];
        for (int i =0; i<arr3.length; i++){
            if (i<arr1.length){
                arr3[i]=arr1[i];
            } else {
                arr3 [i] = arr2[i-arr1.length];
            }
        }
        System.out.println("Mảng đã gộp: " + Arrays.toString(arr3));
    }
}

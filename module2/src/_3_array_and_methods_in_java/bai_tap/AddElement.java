package _3_array_and_methods_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = scanner.nextInt();
        }
        addElement(arr);
    }

    public static void addElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số muốn chèn: ");
        int number = sc.nextInt();
        System.out.println("Nhập vào vị trí muốn chèn: ");
        int index = sc.nextInt();
        if (index <= 1 || index >= array.length - 1) {
            System.out.println("Không thể chèn số vào mảng được.");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
            System.out.print("Danh sách mảng sau khi thêm " + number + " là : " + Arrays.toString(array));
        }
    }

}

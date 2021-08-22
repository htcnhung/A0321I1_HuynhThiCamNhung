package _14_sort_algorithm.bai_tap.bai_2;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {

        //Nhập mảng số
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int[] list = new int[scanner.nextInt()];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        //Hiển thị mảng số đã nhập
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        //Gọi phương thức sort
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    //Cài đặt phương thức insertionSort();
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
        System.out.println("Sorted list: " + Arrays.toString(list));
    }
}

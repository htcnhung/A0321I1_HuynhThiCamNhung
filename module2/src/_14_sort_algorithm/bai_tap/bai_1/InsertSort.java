package _14_sort_algorithm.bai_tap.bai_1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
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
        //Gọi phương thức
        System.out.println("\nBegin sort processing...");
        insertSort(list);
    }

    //Cài đặt phương thức insertSort();
    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            System.out.println("Insert " + list[i] + " into a sorted sublist list[0..." + i + "-1]");
            System.out.println("So that list[0.." + i + "] is sorted");
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            System.out.println("Insert the current element into " + list[j + 1]);
            list[j + 1] = currentElement;
        }
        System.out.println("Sorted list: " + Arrays.toString(list));
    }
}

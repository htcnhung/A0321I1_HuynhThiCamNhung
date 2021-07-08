package _3_array_and_methods_in_java.thuc_hanh;

import java.util.Scanner;

public class FindMaxValueInJavaArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        System.out.print("Enter a size of array: ");
        Scanner scanner = new Scanner(System.in);
        do {
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = 0;
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + ", at position " + index);
    }
}

package _3_array_and_methods_in_java.thuc_hanh;

import java.util.Scanner;

public class FindTheMinimumValueInArrayJava {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Your array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int index = minValue(arr);
        System.out.println("The smallest property value in the list is " + arr[index] +", at position " + index);
    }

    public static int minValue(int[] array) {
        int indexOfMin = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i + 1;
                return indexOfMin;
            }
        }
        return indexOfMin;
    }
}

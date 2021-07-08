package _3_array_and_methods_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của mảng");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số bạn cần tìm kiếm: ");
        int number = scanner.nextInt();
        findValue(arr, number);
    }

    public static void findValue(int[] array, int number) {
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                for (int x = i; x < array.length - 1; x++) {
                    array[x] = array[x + 1];
                }
                array[array.length - 1] = 0;
                System.out.print("Mảng sau khi xóa phần tử " + number + " là: " + Arrays.toString(array));
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy giá trị bạn vừa nhâp trong mảng! ");
        }
    }
}

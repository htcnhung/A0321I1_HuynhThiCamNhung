package _11_danh_sach.bai_tap.bai_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Integer[] arrayInteger = new Integer[6];
        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = scanner.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập là: ");
        System.out.println(Arrays.toString(arrayInteger));
        for (Integer array : arrayInteger) {
            stack.push(array);
        }
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = stack.pop();
        }
        System.out.println("Danh sách mảng sau khi đảo ngược là: ");
        System.out.println(Arrays.toString(arrayInteger));
    }
}

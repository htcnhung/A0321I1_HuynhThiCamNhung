package _11_danh_sach.bai_tap.optional.bai_3;

import java.util.Stack;

public class ChangeFromDecimalToBinary {
    //Chuyển đổi từ hệ thập phân sang hệ nhị phân sử dụng Stack:
    public static void changeFromDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        int temp = number;
        while (number != 0) {
            int x = number % 2;
            stack.push(x);
            number = number / 2;
        }
        System.out.println("Change " + temp + " from Decimal to Binary: ");
        while (!stack.isEmpty()) {
            System.out.print( stack.pop());
        }
    }
}

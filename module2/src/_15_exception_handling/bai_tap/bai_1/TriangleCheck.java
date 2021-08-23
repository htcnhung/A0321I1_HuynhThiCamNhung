package _15_exception_handling.bai_tap.bai_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleCheck {
    public static void checkTrangle(float a, float b, float c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Bạn đang nhập số âm cho cạnh!");
        } else if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalTriangleException("Tổng 2 cạnh tam giác bắt buộc phải lớn hơn cạnh còn lại!");
        } else {
            System.out.println("Tam giác có 3 cạnh là: a=" + a + ", b=" + b + ", c=" + c);
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập cạnh a: ");
                float a = scanner.nextFloat();
                System.out.println("Nhập cạnh b: ");
                float b = scanner.nextFloat();
                System.out.println("Nhập cạnh c: ");
                float c = scanner.nextFloat();
                checkTrangle(a, b, c);
                System.out.println("Nhập thành công độ dài các cạnh tam giác!");
            } catch (IllegalTriangleException e) {
                System.out.println("Bạn đã nhập sai định dạng các cạnh của tam giác!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

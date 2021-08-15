package _11_danh_sach.bai_tap.bai_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập vào chuỗi của bạn: ");
        String s1 = scanner.nextLine();
        System.out.println("Chuỗi bạn vừa nhập là: " + s1);
        String[] mWord = s1.split(" ");
        for (String w : mWord) {
            wStack.push(w);
        }
        String s2 = "";
        for (int i = 0; i < mWord.length; i++) {
            s2 += wStack.pop() + " ";
        }
        System.out.println("Chuỗi sau khi đảo ngược là: " + s2);
    }
}


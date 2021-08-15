package _11_danh_sach.bai_tap.optional;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindromeString {
    public static void main(String[] args) {
        //Cách 1: Sử dụng stack
        System.out.println("Nhập chuỗi bạn muốn check: ");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
//        Stack stack = new Stack();
//        for (int i = 0; i < myString.length(); i++) {
//            stack.push(myString.charAt(i));
//        }
//        String reverseString = "";
//        while (!stack.isEmpty()) {
//            reverseString += stack.pop();
//        }
//        if (myString.equals(reverseString)) {
//            System.out.println("Đây là chuỗi Palindrome!");
//        } else
//            System.out.println("Đây không phải là chuỗi Palindrome!");

        Queue queue = new LinkedList();
        //Hu dien ham
        for (int i = myString.length() - 1; i >= 0; i--) {
            queue.add(myString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        if (myString.equals(reverseString)) {
            System.out.println("Đây là chuỗi Palindrome!");
        } else
            System.out.println("Đây không phải là chuỗi Palindrome");
    }

}

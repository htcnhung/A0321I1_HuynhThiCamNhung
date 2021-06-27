package _1_introduction_to_java.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Những năm chia hết cho 4 mà không chia hết cho 100 là năm nhuận
//        Những năm chia hết cho 100 mà không chia hết cho 400 thì KHÔNG PHẢI là năm nhuận
//        Những năm chia hết đồng thời cho 100 và 400 là năm nhuận

        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }
    }

    }


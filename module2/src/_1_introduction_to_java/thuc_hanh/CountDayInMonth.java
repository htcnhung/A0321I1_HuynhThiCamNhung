package _1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CountDayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int yourMonth = sc.nextInt();
        switch (yourMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println( yourMonth + "has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println( yourMonth + "has 30 days!");
                break;
            case 2:
                System.out.println("The month '2' has 28 or 29 days!");
                break;
            default:
                System.out.println("This number is not a month, please enter again");
                break;
        }
//        String daysInMonth;
//        switch (yourMonth) {
//            case 2:
//                daysInMonth = "28 or 29";
//                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                daysInMonth = "31";
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                daysInMonth = "30";
//                break;
//            default:
//                daysInMonth = "";
//        }
//
//        if (daysInMonth != "") {
//            System.out.printf("The month '%d' has %s days!", yourMonth, daysInMonth); // Nhờ tutor giải thích dòng này
//        } else {
//            System.out.print("Invalid input!");
//        }
    }
}

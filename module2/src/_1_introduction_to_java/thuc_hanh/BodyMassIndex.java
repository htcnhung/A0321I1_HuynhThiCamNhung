package _1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter our weight : ");
//        double weight = scanner.nextDouble();
//        scanner.next();
//        System.out.println("Enter our height: ");
//        double height = scanner.nextDouble();
//        //float bmi = weight/(height*height);
//        double bmi = weight / Math.pow(height, 2);
//        if (bmi < 18.5) {
//            System.out.println("Under weight!");
//        } else if (bmi < 25.0) {
//            System.out.println("Normal");
//        } else if (bmi < 30) {
//            System.out.println("Over weight!");
//        } else {
//            System.out.println("Obese4");
//        }

        //CÁCH 2
        Scanner sc = new Scanner(System.in);
        double weight, height;
        System.out.println("Nhập vào trọng lượng cơ thể: ");
        weight = sc.nextDouble();
        System.out.println("Nhập vào chiều cao cơ thể: ");
        height = sc.nextDouble();
        double bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }

}

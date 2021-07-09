package _4_class_and_object_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2");
        System.out.println("Nhập vào số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Phương trình của bạn là: " + quadraticEquation.getA() + "*x^2 + " +
                quadraticEquation.getB() + "x + " + quadraticEquation.getC() + " = 0");
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("Phương trình có hai nghiệm: ");
            System.out.println("Nghiệm thứ nhất x1 = " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ nhất x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có một nghiệm x là: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }

    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        //delta = b2 - 4ac
        return 2 * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

}

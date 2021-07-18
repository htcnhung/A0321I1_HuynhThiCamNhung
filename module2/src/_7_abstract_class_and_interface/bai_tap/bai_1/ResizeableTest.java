package _7_abstract_class_and_interface.bai_tap.bai_1;

import java.util.Arrays;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapesArray = new Shape[3];
        shapesArray[0] = new Circle(4);
        shapesArray[1] = new Rectangle(5, 3, "red", true);
        shapesArray[2] = new Square(4);
        System.out.println("Trước khi tăng kích thước: " + "\n" + Arrays.toString(shapesArray));
        for (Shape shape : shapesArray) {
            shape.resize(2);
        }
        System.out.println("Sau khi tăng kích thước: " + "\n" + Arrays.toString(shapesArray));
    }
}

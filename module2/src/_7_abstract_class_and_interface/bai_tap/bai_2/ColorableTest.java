package _7_abstract_class_and_interface.bai_tap.bai_2;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapesArray = new Shape[3];
        shapesArray[0] = new Circle(3);
        shapesArray[1] = new Rectangle(4, 6, "red", true);
        shapesArray[2] = new Square(5, "black", false);

        for (Shape shape : shapesArray) {
            if (shape instanceof Colorable) { // Vì sao nếu thay Colorable bằng Shape vẫn được???
                System.out.println(shape.toString());

                ((Colorable)shape).howToColor();
            } else {
                System.out.println(shape.toString());
            }
        }
    }
}

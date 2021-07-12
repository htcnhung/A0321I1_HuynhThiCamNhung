package _5_access_modifier_static_method_static_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Bán kính hình tròn là: " + c.getRadius());
        System.out.println("Diện tích hình tròn là: " + c.getArea());
    }
}

package _5_access_modifier_static_method_static_property.bai_tap;

public class Circle {
    private String color = "red";
    private double radius = 1.0;
    Circle(){

    };
    Circle(double radius){
        this.radius = radius;
    };

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (this.radius*this.radius)*Math.PI;
    }
}

package _6_inheritance.bai_tap.bai_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return  getArea()* height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height= " + getHeight() +
                ", volume = " + getVolume() +
                ", which is a subclass of " + super.toString() +
                '}';
    }
}

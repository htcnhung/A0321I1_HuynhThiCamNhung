package _4_class_and_object_in_java.bai_tap;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(1);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (this.on){
            return  "Trạng thái quạt đang bật, " + " tốc độ " + this.speed + " màu sắc " + this.color + " radius " + this.radius;
        } else {
            return  "Trạng thái quạt đang tắt, " + " tốc độ " + this.speed + " màu sắc " + this.color + " radius " + this.radius;
        }
    }
}

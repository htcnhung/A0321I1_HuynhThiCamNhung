package _7_abstract_class_and_interface.thuc_hanh.bai_2;

import _6_inheritance.thuc_hanh.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

        public ComparableCircle() {
        }

        public ComparableCircle(double radius) {
            super(radius);
        }

        public ComparableCircle(double radius, String color, boolean filled) {
            super(radius, color, filled);
        }

        @Override
        //Hỏi giảng viên chỗ này
        public int compareTo(ComparableCircle o) {
            if (getRadius() > o.getRadius()) return 1;
            else if (getRadius() < o.getRadius()) return -1;
            else return 1;
        }
}

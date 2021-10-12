package _06_abstract_interface.practice.interface_comparable;

import _06_abstract_interface.practice.interface_comparator.Circle;

public class CircleTest {
    public static void main(String[] args) {
        _06_abstract_interface.practice.interface_comparator.Circle circle = new _06_abstract_interface.practice.interface_comparator.Circle();
        System.out.println(circle);

        circle = new _06_abstract_interface.practice.interface_comparator.Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}

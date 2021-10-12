package _06_abstract_interface.exercise.resizeable;

import _06_abstract_interface.exercise.Circle;
import _06_abstract_interface.exercise.Rectangle;
import _06_abstract_interface.exercise.Square;

public class ResizeAbleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.7,"green" , true);
        Rectangle rectangle= new Rectangle(3.4, 4.5 , "yellow" , true);
        Square square = new Square(15.5,"green" , true);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        circle.resize(5);
        System.out.println(circle);
        rectangle.resize(5);
        System.out.println(rectangle);
        square.resize(5 );
        System.out.println(square);
    }
}

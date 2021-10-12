package _06_abstract_interface.exercise;
import _06_abstract_interface.exercise.colorable.ColorAble;
import _06_abstract_interface.exercise.resizeable.ResizeAble;

public class Square extends Rectangle implements ColorAble, ResizeAble {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Square after change : "+percent + getArea());
    }
}
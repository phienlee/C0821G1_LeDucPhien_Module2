package _04_access_modifier.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        circle.setColor("Blue");
        circle.setRadius(5.8);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
//        Circle circle1 = new Circle(5.6);
//        circle1.setColor("Yellow");
//        System.out.println(circle1);
//        System.out.println(circle1.getArea());
//        System.out.println(circle1.getRadius());
    }
}

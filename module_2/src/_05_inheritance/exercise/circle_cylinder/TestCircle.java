package _05_inheritance.exercise.circle_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle =new Circle(2.5);
        System.out.println(circle);
        circle=new Circle(4.9,"yellow");
        System.out.println(circle);
    }
}

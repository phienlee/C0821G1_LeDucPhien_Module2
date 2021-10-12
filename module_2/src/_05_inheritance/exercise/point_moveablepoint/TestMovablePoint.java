package _05_inheritance.exercise.point_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablesPoint = new MovablePoint();
        System.out.println(movablesPoint);
        movablesPoint = new MovablePoint(1f, 3.4f, 5.8f, 4.7f);
        System.out.println(movablesPoint);
        movablesPoint = new MovablePoint(2.23f, 2.5f);
        System.out.println(movablesPoint);
        movablesPoint.setXY(2.65f, 17.34f);
        System.out.println(movablesPoint);
        movablesPoint.setSpeed(5.6f, 6.89f);
        System.out.println(movablesPoint);
        movablesPoint.move();
        System.out.println(movablesPoint);
    }
}

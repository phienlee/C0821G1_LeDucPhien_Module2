package review_oop.ex_1;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(150, 20000000);
        Vehicle car2 = new Vehicle();
        car1.setCylinder(90);
        car1.setMoneyCar(10000000);
        System.out.println(car1);
        System.out.println("Tax of vehicle 1 : " + car1.tax(car1.getCylinder()) + " VND");
        car2.setCylinder(120);
        car2.setMoneyCar(10000000);
        System.out.println(car2);
        System.out.println("Tax of vehicle 2 : " + car2.tax(car2.getCylinder()) + " VND");

    }
}

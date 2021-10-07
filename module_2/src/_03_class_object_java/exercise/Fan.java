package _03_class_object_java.exercise;

public class Fan {
    public static final byte SLOW = 1;
    public static final byte MEDIUM = 2;
    public static final byte FAST = 3;
    public static final boolean ON = true;
    public static final boolean OFF = false;
    public static final String BLUE = "blue";


    private int speed;
    private boolean isOn;
    private int radius;
    private String color;

    public Fan(int speed, boolean isOn, int radius, String color) {
        this.speed = SLOW;
        this.isOn = ON;
        this.radius = 5;
        this.color = BLUE;
    }

    public Fan() {

    }

    public static byte getSLOW() {
        return SLOW;
    }

    public static byte getMEDIUM() {
        return MEDIUM;
    }

    public static byte getFAST() {
        return FAST;
    }

    public static boolean isON(boolean on) {
        return ON;
    }

    public static boolean isOFF(boolean off) {
        return OFF;
    }

    public static String getBLUE() {
        return BLUE;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn(boolean on) {
        return isOn;
    }

    public int getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString1() {
        if (isOn) {
            return "Fan is ON {" +
                    "speed = " + speed +
                    ", radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        } else {
            return "Fan is OFF {" +
                    "radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(ON);
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        System.out.println("Fan 1 info"+fan1.toString1());
        fan2.setOn(OFF);
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        System.out.println("Fan 2 info"+fan2.toString1());
    }
}

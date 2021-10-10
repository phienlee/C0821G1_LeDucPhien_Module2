package _04_access_modifier.exercise;

public class Main {
    public static int a;

    public static void b() {
        System.out.println("Method");
    }
    public static void c() {
        System.out.println("Method  " + a);
    }
    static {
        System.out.println("Block");
    }

    public static void main(String[] args) {
        b();
        System.out.println(a);
        c();
    }
}

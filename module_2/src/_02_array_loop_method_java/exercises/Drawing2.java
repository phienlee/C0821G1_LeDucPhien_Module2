package _02_array_loop_method_java.exercises;

public class Drawing2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}

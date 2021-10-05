package _02_array_loop_method_java.exercises;

public class Drawing3 {
    public static void main(String[] args) {
        int count = 6;
        for (int i = 1; i < count; i++) {
            for (int j = count; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

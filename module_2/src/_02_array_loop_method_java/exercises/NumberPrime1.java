package _02_array_loop_method_java.exercises;

public class NumberPrime1 {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while (count < 20) {
            if (NumberPrime.isNumberPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}


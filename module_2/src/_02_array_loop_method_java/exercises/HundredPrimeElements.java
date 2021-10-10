package _02_array_loop_method_java.exercises;

public class HundredPrimeElements {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while (count < 20) {
            if (FirstTwentyPrimeElements.isNumberPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}


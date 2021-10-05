package _02_array_loop_method_java.exercises;

public class NumberPrime {
    public static void main(String[] args) {
        int i = 2;
        int count = 0;
        while (count < 100){
            if (isNumberPrime(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isNumberPrime(int number) {
        if (number <= 1) {
           return false;
        } else {
            for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
                if (number % i == 0) {
                       return false;
                }
            }
        }
        return true;
    }
}

package _02_array_loop_method_java;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        boolean check = false;
        do {
            System.out.println("Enter is number");
            number = scanner.nextInt();
            if (number <= 1 || number > 100){
                check = false;
                System.out.println("Number must be smaller greater than 1 and less than 100");
            }else {
                check = true;
            }
        }while (!check);
        if (number % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (number > 2 && number < 5) {
                System.out.println("Not weird");
            } else if (number > 6 && number < 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not weird");
            }
        }
    }
}

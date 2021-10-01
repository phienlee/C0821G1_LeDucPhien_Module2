package _01_introduction_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so USD ");
        usd = scanner.nextInt();
        int rate = 23000 * usd;
        System.out.println("So tien quy doi la : " + rate + "VND");

    }
}

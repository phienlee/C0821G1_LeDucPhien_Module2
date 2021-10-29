package _16_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
        while (true) {
            System.out.println("Enter phone number");
            String string = scanner.nextLine();
            if (pattern.matcher(string).find()) {
                System.out.println("Phone number is ok");
                break;
            } else {
                System.err.println("Phone number is not oke");
            }
        }
    }
}

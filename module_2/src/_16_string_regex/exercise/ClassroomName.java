package _16_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassroomName {
     ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[CAP]{1}\\d{4}[GHIKLM]{1}$");
        while (true) {
            System.out.println("Enter classroom name");
            String string = scanner.nextLine();
            if (pattern.matcher(string).find()) {
                System.out.println("classroom name is ok");
                break;
            } else {
                System.err.println("classroom name is not oke");
            }
        }
    }
}

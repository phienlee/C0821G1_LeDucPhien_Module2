import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        String[] numberText = {
                "",
                "Ten",
                "Twenty",
                "Thirty",
                "Forty",
                "Fifty",
                "Sixty",
                "Seventy",
                "Eighty",
                "Ninety",
        };
        String[] readNumber = {
                "",
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine",
                "Ten",
                "Eleven",
                "Twelve",
                "ThirdTeen",
                "FourTeen",
                "FiveTeen",
                "SixTeen",
                "SevenTeen",
                "EightTeen",
                "NineTeen",
        };
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao number");
        number = scanner.nextInt();
        int hundred = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        String result = "";
        if (number < 0 || number > 999) {
            System.out.println("Khong the xu ly");
        } else if (number < 20) {
            if (number == 0) {
                result = "Zero";
            } else {
                result = readNumber[number];
            }
        } else if (number < 100) {
            result = numberText[tens] + readNumber[ones];
        } else {
            if (tens == 0 && ones == 0) {
                result = readNumber[hundred] + "hundred " + numberText[tens] + readNumber[ones];
            } else if (tens < 2) {
                result = readNumber[hundred] + "hundred " + readNumber[tens * 10 + ones];
            } else {
                result = readNumber[hundred] + " hundred " + numberText[tens] + readNumber[ones];
            }
        }
        System.out.println(result);
    }
}


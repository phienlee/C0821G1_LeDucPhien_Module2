package _13_exception_debug.exercise;

import java.util.Scanner;

public class Triangle {
    public static double[] inputTriangleSide() throws IllegalTriangleException, NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
            try {
                System.out.println("Enter triangle edge a: ");
                a = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter triangle edge b: ");
                b = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter triangle edge c: ");
                c = Double.parseDouble(scanner.nextLine());
                if (a < 0 || b < 0 || c < 0) {
                    throw new IllegalTriangleException("Length of triangle edge need to greater 0.");
                }
                if (a + b <= c || b + c <= a || a + c <= b) {
                    throw new IllegalTriangleException("Sum of 2 edge need to greater other edge.");
                }
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException exception) {
                throw new IllegalTriangleException("Length of triangle need to be a number");
            }
            return new double[]{a, b, c};
        }


    public static void main(String[] args) {
        try {
            double[] sides = inputTriangleSide();
            System.out.println("Three of triangle edge is: ");
            for (double edge : sides) {
                System.out.println(edge);
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

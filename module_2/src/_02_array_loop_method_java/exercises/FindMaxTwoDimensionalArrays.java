package _02_array_loop_method_java.exercises;

import java.util.Scanner;

public class FindMaxTwoDimensionalArrays {
    public static void main(String[] args) {
        // khai báo số hàng và số cột của mảng 2 chiều
        int row, column;

        int[][] array;
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter number of rows : ");
            row = scanner.nextInt();
            System.out.println("Enter number of columns: ");
            column = scanner.nextInt();

            // khai báo ma trận A có row dòng, column cột
            array = new int[row][column];

            System.out.println("Enter the element for Matrix list: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    array[i][j] = scanner.nextInt();
                }
            }
        }

        // tìm phần tử có giá trị lớn nhất trong mảng 2 chiều
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
        int max = array[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("The max value in Matrix is = " + max);
    }
}

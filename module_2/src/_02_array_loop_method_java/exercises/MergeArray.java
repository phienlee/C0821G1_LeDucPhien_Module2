package _02_array_loop_method_java.exercises;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int[] arr1;
        int[] arr2;
        // kiểm tra sô phần tử không quá 20
        do {
            System.out.println("Enter size for number first list");
            number1 = scanner.nextInt();
            if (number1 > 20)
                System.out.println("Size does not great than 20");
        } while (number1 > 20);
        // khai báo danh sách số nguyên 1 với độ dài bằng number1 nhập vào
        arr1 = new int[number1];
        // nhập vào các phần tử từ bàn phím
        int i = 0;
        while (i < arr1.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        // in ra mảng 1 trước khi chèn
        System.out.println("Before insert");
        for (int num1 : arr1) {
            System.out.print(num1 + "\t");
        }
        // list số thứ 2;
        do {
            System.out.println("\nEnter size for second number list ");
            number2 = scanner.nextInt();
            if (number2 > 20)
                System.out.println("Size does not great than 20");
        } while (number2 > 20);
        // khai báo danh sách số nguyên 2 với độ dài bằng number2 nhập vào
        arr2 = new int[number2];
        // nhập vào các phần tử từ bàn phím
        int j = 0;
        while (j < arr2.length) {
            System.out.println("Enter element " + (j + 1) + " : ");
            arr2[j] = scanner.nextInt();
            j++;
        }
        // in ra mảng 2 trước khi chèn
        System.out.println("Before insert");
        for (int num2 : arr2) {
            System.out.print(num2 + "\t");
        }
        // khai báo mảng thứ 3 bằng độ dài hai mảng trước đó
        int[] arr3 = new int[number1 + number2];
        // gán mảng 1 vào mảng 3 mới
        for (int k = 0; k < arr1.length; k++) {
            arr3[k] = arr1[k];
        }
        // tiếp tục gán mảng 2 vào mảng 3 bắt đầu từ vị trí sau phần tử cuối cùng của mảng 1
        for (int k = arr1.length; k < arr3.length; k++) {
            arr3[k] = arr2[k - arr1.length];
        }
        // in ra mảng mới
        System.out.println("Number list after add first and second list");
        for (int number3 :
                arr3) {
            System.out.print(number3 + " ");
        }
    }
}

package _02_array_loop_method_java.exercises;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {

        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            n = scanner.nextInt();
            if (n > 20)
                System.out.println("Size does not great than 20");
        } while (n > 20);
        arr = new int[n];
        int  j = 0;
        while (j < arr.length) {
            System.out.println("Enter element " + (j + 1) + " : ");
            arr[j] = scanner.nextInt();
            j++;
        }
        System.out.println("Before delete");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println("\nMin value in list is : " + minValue(arr));
    }
    public static int minValue(int[] array) {
        int minArr = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<minArr) {
                minArr = array[i];
            }
        }
        return minArr;
    }
}


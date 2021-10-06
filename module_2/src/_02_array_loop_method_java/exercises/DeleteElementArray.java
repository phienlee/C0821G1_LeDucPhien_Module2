package _02_array_loop_method_java.exercises;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray;
        int[] arr;
        do {
            System.out.println("Enter size");
            sizeArray = scanner.nextInt();
            if (sizeArray > 20)
                System.out.println("Size does not great than 20");
        } while (sizeArray > 20);
        arr = new int[sizeArray];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Before delete");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println("\n Enter key");
        int key = scanner.nextInt();
        int c = deleteElement(arr, sizeArray, key);
        System.out.println("After delete " + key);
        for (int j = 0; j < c; j++) {
            System.out.print(arr[j] + "\t");
        }

    }

    public static int deleteElement(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1) {
            System.out.println("Not found Please try again");
        } else {
            int temp;
            for (int j = pos; j < n - 1; j++) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            arr[arr.length - 1] = 0;
        }

        return n - 1;
    }

    public static int searchElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}


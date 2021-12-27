package javaFromEpam.chapter001TaskB;

import java.util.Scanner;

public class ReturnIntArray {
    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] ints = new int[size];
        System.out.println("Enter the array's elements: ");
        for (int i = 0; i < size; i++) {
            ints[i] = scanner.nextInt();
        }
        return ints;
    }
}



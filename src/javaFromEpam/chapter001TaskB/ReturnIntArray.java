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
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    int nIntegers = (int)(Math.random() * 10 + 1);
//    String[] strArray;
//        do {
//        System.out.println("Enter " + nIntegers + " integers");
//        String line = reader.readLine();
//        System.out.println(line);
//        strArray = line.split(" ");
//    } while (strArray.length != nIntegers);
//    int[] intsFromStr = new int[strArray.length];
//        for (int i = 0; i < strArray.length; i++) {
//        intsFromStr[i] = Integer.parseInt(strArray[i].trim());



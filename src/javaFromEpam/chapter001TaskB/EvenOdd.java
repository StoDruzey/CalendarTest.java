package javaFromEpam.chapter001TaskB;

public class EvenOdd {
    public String[] returnEvenOdd(int[] intArray) {
        String[] evenOdd = new String[2];
        evenOdd[0] = "Even numbers: ";
        evenOdd[1] = "Odd numbers: ";
        for (int i : intArray) {
            if (i % 2 == 0) evenOdd[0] += i + " ";
            else evenOdd[1] += i + " ";
        }
        return evenOdd;
    }
}

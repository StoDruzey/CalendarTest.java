package javaFromEpam.chapter001TaskB;

public class DivisibilityAnd implements Convertable {
    public int k = 0;
    public int[] returnConvertedNumbers (int[] intArray) {
        int a = 5, b = 7;
        int[] arrResult = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] % a == 0) && (intArray[i] % b == 0)) {
                arrResult[k] = intArray[i];
                k++;
            }
        }
        return arrResult;
    }
}

package javaFromEpam.chapter001TaskB;

public class MinMax {
    public int[] returnMinMax(int[] intArray) {
        int[] arrMinMax = new int[2];
//        int min = 2147483647, max = -2147483648;
        int min = intArray[0];
        int max = intArray[0];
        for (int i : intArray) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        arrMinMax[0] = min;
        arrMinMax[1] = max;
        return arrMinMax;
    }
}

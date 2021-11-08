package javaFromEpam.chapter001TaskB;

public class ThreeDigitDif {
    public int k = 0;
    public int[] returnThreeDigitDif (int[] intArray) {
        int[] arrResult = new int[intArray.length]; // массив для хранения результатов
        for (int i = 0; i < intArray.length; i++) {
            int check = intArray[i] / 100;
            if (check >= 1 && check < 10) { // если число трехзначное...
                int ed = 0, des = 0, sot = 0; // находим цифры числа
                ed = intArray[i] % 10;
                des = intArray[i] / 10 % 10;
                sot = intArray[i] / 100;
                if ((ed != des) && (ed != sot) && (des != sot)) { // только если все цифры разные, помещаем число в результирующий массив
                    arrResult[k] = intArray[i];
                    k++;
                }
            }
        }
        return arrResult;
    }
}

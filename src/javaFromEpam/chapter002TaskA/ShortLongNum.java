package javaFromEpam.chapter002TaskA;
//         Ввести n чисел с консоли.
//        1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class ShortLongNum {
    /* перебираем массив чисел. Находим кол-во разрядов каждого числа. Если у i-го разрядов меньше, оно становится
    shortest. Если больше, оно становится largest. Если столько же, то пропускаем */

    public void returnConvertedNumbers(int[] intArray) {
        int rank = 0; // количество разрядов
        int shortest = 0, largest = 0;
        int numMin = intArray[0]; // введенное число
        int numMax = intArray[0];

        for (int i = 0; i < intArray.length; i++) { // переберем весь массив

            for (int k = 1; Math.abs(intArray[i]) / k >= 1; k *= 10) { //разберем каждое число по разрядам
                rank++;
            }
            if (intArray[i] == 0) rank = 1;
            if (i == 0) {
                shortest = largest = rank; /* присваиваем разрядность первого числа shortest и largest, чтобы сравнивать
                остальные числа в массиве с первым, потому что если присваивать начальные значения, то какие? */
                //numMin = numMax = intArray[i];
            }
            if (rank < shortest) {
                shortest = rank; numMin = intArray[i];
            } else if (rank > largest) {
                largest = rank; numMax = intArray[i];
            }
            rank = 0;
        }
        System.out.println("Самое короткое число = " + numMin + " , разрядов " + shortest);
        System.out.println("Самое длинное число = " + numMax + " , разрядов " + largest);
    }
}

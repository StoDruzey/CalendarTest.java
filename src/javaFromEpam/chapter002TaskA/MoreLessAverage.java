package javaFromEpam.chapter002TaskA;
//         Ввести n чисел с консоли.
//        3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

public class MoreLessAverage {
    /* Создаем дополнительный массив разрядов чисел. Перебираем входной массив чисел. Находим кол-во разрядов каждого числа,
записываем в дополнительный массив с тем же индексом, что и число. Затем вывод на консоль */
    public void returnConvertedNumbers(int[] intArray) {
        int[] capacityNum = new int[intArray.length];
        int rank = 0; // количество разрядов
        int average = 0; // среднее значение длины числа
        for (int i = 0; i < intArray.length; i++) { // переберем весь массив
            for (int k = 1; Math.abs(intArray[i]) / k >= 1; k *= 10) { //разберем каждое число по разрядам
                rank++;
            }
            if (intArray[i] == 0) rank = 1;
            capacityNum[i] = rank; // заполним массив длин чисел
            average += rank;
            rank = 0;
        }
        average = average / capacityNum.length;
        System.out.println("Average length = " + average);
        System.out.println("Numbers larger or shorter of an average are: ");
        for (int i = 0; i < capacityNum.length; i++) {
            if (capacityNum[i] != average) {
                System.out.println("Number is " + intArray[i] + " capacity is " + capacityNum[i]);
            }
        }
    }
}

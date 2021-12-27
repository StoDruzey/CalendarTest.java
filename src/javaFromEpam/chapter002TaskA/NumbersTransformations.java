package javaFromEpam.chapter002TaskA;

import javaFromEpam.chapter001TaskB.ReturnIntArray;

//         Ввести n чисел с консоли.
//        1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//        2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
//        3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
//        4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.

public class NumbersTransformations {
    public static void main(String[] args) {
        ReturnIntArray array = new ReturnIntArray(); // ввод с консоли n целых чисел
        int[] intArray = array.createArray(); // массив введенных чисел
        // 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        ShortLongNum shortLongNum = new ShortLongNum();
        shortLongNum.returnConvertedNumbers(intArray);
        // 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        SortNum sortNum = new SortNum();
        sortNum.returnConvertedNumbers(intArray);
        // 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        MoreLessAverage moreLessAverage = new MoreLessAverage();
        moreLessAverage.returnConvertedNumbers(intArray);
        // 4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
        DifCapacity difCapacity = new DifCapacity();
        difCapacity.returnConvertedNumbers(intArray);

    }
}

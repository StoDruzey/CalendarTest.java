package javaFromEpam.chapter002TaskA;
//         Ввести n чисел с консоли.
//        2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

public class SortNum {
    /* Создаем дополнительный массив разрядов чисел. Перебираем входной массив чисел. Находим кол-во разрядов каждого числа,
    записываем в дополнительный массив с тем же индексом, что и число. Затем одновременно сортируем оба массива по признаку
    разрядности */
    public void returnConvertedNumbers(int[] intArray) {
        int[] capacityNum = new int[intArray.length];
        int rank = 0; // количество разрядов
        for (int i = 0; i < intArray.length; i++) { // переберем весь массив
            for (int k = 1; Math.abs(intArray[i]) / k >= 1; k *= 10) { //разберем каждое число по разрядам
                rank++;
            }
            if (intArray[i] == 0) rank = 1;
            capacityNum[i] = rank; // заполним массив длин чисел
            rank = 0;
        }
        // одновременная сортировка обоих массивов
        int indexShortest = 0;
        for (int i = 0; i < capacityNum.length - 1; i++) {
            for (int k = i + 1; k < capacityNum.length; k++) { // ищем минимум среди оставшихся
                if (capacityNum[k] < capacityNum[indexShortest]) { // получаем индекс самого короткого
                    indexShortest = k;
                }
            }
            int tmpIntArray = intArray[i]; // меняем местами
            int tmpCapacity = capacityNum[i];
            intArray[i] = intArray[indexShortest];
            capacityNum[i] = capacityNum[indexShortest];
            intArray[indexShortest] = tmpIntArray;
            capacityNum[indexShortest] = tmpCapacity;
            indexShortest = i + 1;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " " + capacityNum[i]);
        }
    }
}

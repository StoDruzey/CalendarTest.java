package javaFromEpam.chapter002TaskA;
//         Ввести n чисел с консоли.
//        4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
public class DifCapacity {
    /* Создаем дополнительный массив разрядов чисел. Перебираем входной массив чисел. Находим кол-во разрядов каждого числа,
записываем в дополнительный массив с тем же индексом, что и число. Затем вывод на консоль */
    public void returnConvertedNumbers(int[] intArray) {
        int[] capacityNum = new int[intArray.length]; // в этом массиве будет храниться количество цифр каждого числа
        int[] tmpCapacityNum = new int[10];
        int numDD = 1;
        for (int i = 0; i < intArray.length; i++) { // переберем весь массив
            for (int k = 1, n = 0; Math.abs(intArray[i]) / k >= 1; k *= 10, n++) { //разберем каждое число по разрядам
                tmpCapacityNum[n] = Math.abs(intArray[i]) / k % 10; // значение каждого разряда записываем во временный массив
                //rank++;
            }
            // во временном массиве находим количество разных цифр и записываем его значение в постоянный массив
            //capacityNum[i] = 1;
            for (int j = 1; j < tmpCapacityNum.length && tmpCapacityNum[j] != 0; j++) {
                if (tmpCapacityNum[j] != tmpCapacityNum[j - 1] {

                }
                //capacityNum[i] =
            }
//            if (intArray[i] == 0) rank = 1;
//            capacityNum[i] = rank; // заполним массив длин чисел
//            average += rank;
//            rank = 0;
        }
//        average = average / capacityNum.length;
//        System.out.println("Average length = " + average);
//        System.out.println("Numbers larger or shorter of an average are: ");
//        for (int i = 0; i < capacityNum.length; i++) {
//            if (capacityNum[i] != average) {
//                System.out.println("Number is " + intArray[i] + " capacity is " + capacityNum[i]);
//            }
//        }
    }
}

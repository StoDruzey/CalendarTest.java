package javaFromEpam.chapter001TaskB;
//Ввести с консоли n целых чисел. На консоль вывести:
//        1. Четные и нечетные числа.
//        2. Наибольшее и наименьшее число.
//        3. Числа, которые делятся на 3 или на 9.
//        4. Числа, которые делятся на 5 и на 7.
//        5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
//        6. Простые числа.
//        7. Отсортированные числа в порядке возрастания и убывания.
//        8. Числа в порядке убывания частоты встречаемости чисел.
//        9. «Счастливые» числа.
//        10. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
//        11. Элементы, которые равны полусумме соседних элементов.

public class ConsoleDemo {

    public static void main(String[] args) {
        ReturnIntArray arr = new ReturnIntArray(); // ввод с консоли n целых чисел
        int[] intArray = arr.createArray(); // массив введенных чисел

        //        1. Четные и нечетные числа.
        EvenOdd obj = new EvenOdd(); // вывод в консоль четных и нечетных чисел
        String[] outEvenOdd = obj.returnEvenOdd(intArray);
        System.out.print("1. " + outEvenOdd[0] + " ");
        System.out.println(outEvenOdd[1]);

        // 2. вывод минимального и максимального
        Convertable intMinMax = new MinMax();
        int[] arrMinMax = intMinMax.returnConvertedNumbers(intArray);
        System.out.print("2. Min number is: " + arrMinMax[0] + " ");
        System.out.println("Max number is: " + arrMinMax[1]);

        // 3. вывод чисел, которые делятся на 3 или на 9
        Convertable threeOrNine = new DivisibilityOr();
        int[] arrThreeOrNine = threeOrNine.returnConvertedNumbers(intArray);
        System.out.print("3. Numbers dividing for 3 or 9: ");
        for (int i = 0; i < ((DivisibilityOr) threeOrNine).k; i++) {
            System.out.print(arrThreeOrNine[i] + " ");
        }
        System.out.println();
        // 4. вывод чисел, которые делятся на 5 и на 7
        Convertable fiveAndSeven = new DivisibilityAnd();
        int[] arrFiveAndSeven = fiveAndSeven.returnConvertedNumbers(intArray);
        System.out.print("4. Numbers dividing for 5 and 7: ");
        for (int i = 0; i < ((DivisibilityAnd) fiveAndSeven).k; i++) {
            System.out.print(arrFiveAndSeven[i] + " ");
        }
        //        5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        Convertable threeDigit = new ThreeDigitDif();
        int[] arrThreeDigitDif = threeDigit.returnConvertedNumbers(intArray);
        System.out.print("\n5. 3-digit numbers with different digits: ");
        for (int i = 0; i < ((ThreeDigitDif) threeDigit).k; i++) {
            System.out.print(arrThreeDigitDif[i] + " ");
        }
        // 6. Простые числа
        Convertable primeNumber = new PrimeNumber();
        int[] arrPrimeNumber = primeNumber.returnConvertedNumbers(intArray);
        System.out.print("\n6. Prime numbers: ");
        for (int i = 0; i < ((PrimeNumber) primeNumber).k; i++) {
            System.out.print(arrPrimeNumber[i] + " ");
        }
        //        7. Отсортированные числа в порядке возрастания...
        Convertable sortedUp = new SortedUp();
        int[] arrSortedUp = sortedUp.returnConvertedNumbers(intArray);
        System.out.print("\n7.1 Sorted up array: ");
        for (int i = 0; i < arrSortedUp.length; i++) {
            System.out.print(arrSortedUp[i] + " ");
        }
        // ...и убывания.
        Convertable sortedDown = new SortedDown();
        int[] arrSortedDown = sortedDown.returnConvertedNumbers(intArray);
        System.out.print("\n7.2 Sorted down array: ");
        for (int i = 0; i < arrSortedDown.length; i++) {
            System.out.print(arrSortedDown[i] + " ");
        }
        int x = 1;
        int y = 3;
        int z = x % y;
        System.out.println("z = " + z);

        //        8. Числа в порядке убывания частоты встречаемости чисел.
//        FreqDown freqDown = new FreqDown();
//        int[] arrFreqDown = freqDown.returnConvertedNumbers(intArray);
//        System.out.println("\n8. Frequency down array: ");
//        for (int i = 0; i <= arrFreqDown.length/*freqDown.pointerArrResult*/; i++) {
//            System.out.print(arrFreqDown[i] + " " + ":" + " " + arrFreqDown[++i] + "\n");
//        }


    }
}

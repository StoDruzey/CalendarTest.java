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
        EvenOdd obj = new EvenOdd(); // вывод в консоль четных и нечетных чисел
        String[] outEvenOdd = obj.returnEvenOdd(intArray);
        System.out.print("1. " + outEvenOdd[0] + " ");
        System.out.println(outEvenOdd[1]);
        MinMax intMinMax = new MinMax(); // вывод минимального и максимального
        int[] arrMinMax = intMinMax.returnMinMax(intArray);
        System.out.print("2. Min number is: " + arrMinMax[0] + " ");
        System.out.println("Max number is: " + arrMinMax[1]);
        DivisibilityOr threeOrNine = new DivisibilityOr(); // вывод чисел, которые делятся на 3 или на 9
        int[] arrThreeOrNine = threeOrNine.returnDividedOr(intArray, 3, 9);
        System.out.print("3. Numbers dividing for 3 or 9: ");
        for (int i = 0; i < threeOrNine.k; i++) {
            System.out.print(arrThreeOrNine[i] + " ");
        }
        System.out.println();
        DivisibilityAnd fiveAndSeven = new DivisibilityAnd(); // вывод чисел, которые делятся на 5 и на 7
        int[] arrFiveAndSeven = fiveAndSeven.returnDividedAnd(intArray, 5, 7);
        System.out.print("4. Numbers dividing for 5 and 7: ");
        for (int i = 0; i < fiveAndSeven.k; i++) {
            System.out.print(arrFiveAndSeven[i] + " ");
        }
        //        5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        ThreeDigitDif threeDigit = new ThreeDigitDif();
        int[] arrThreeDigitDif = threeDigit.returnThreeDigitDif(intArray);
        System.out.print("\n5. 3-digit numbers with different digits: ");
        for (int i = 0; i < threeDigit.k; i++) {
            System.out.print(arrThreeDigitDif[i] + " ");
        }
    }
}

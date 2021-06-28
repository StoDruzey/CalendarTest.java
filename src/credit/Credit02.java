package credit;

public class Credit02 {
    public static void main(String[] args) {
        // Задание 3. в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
        //далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза
        //о количестве полных часов, содержащихся в n секундах.
        int sek = (int)(Math.random() * 28801);
        int hours;
        System.out.println(sek);
        hours = sek / 3600;
        switch (hours) {
            case 8:
            case 7:
            case 6:
            case 5: System.out.println("Осталось "+hours+" часов"); break;
            case 4:
            case 3:
            case 2: System.out.println("Осталось "+hours+" часa"); break;
            case 1: System.out.println("Остался "+hours+" час"); break;
            default:    if (hours == 0 && sek % 3600 != 0) System.out.println("Осталось менее часа");
                        else if (sek == 0) System.out.println("Рабочий день закончился");
        }
        System.out.println();

        // Задание 4. Для введенного целого числа определить является ли это число простым
        int num = 113;
        int root;
        // если больше 2 делителей, число составное, если ровно 2, то простое
        // делители проверяем до квадратного корня из num, значит делитель должен остаться только 1: единица
        // но т.к. любой число делится на 1, то цикл запускаем с 2. Если найдется хотя бы 1 делитель, число составное
        System.out.print("Число "+num+" ");
        root = (int)(Math.sqrt(num));
        for (int i = 2; i <= root; i++) {
            if (num % i == 0) {
                System.out.println("является составным"); System.exit(0);
            }
        }
        System.out.println("является простым");
        System.out.println();

        //Задание 5. Электронные часы показывают время в формате от 00:00 до 23:59.
        //Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
        //что справа от двоеточия (например, 02:20, 11:11 или 15:51)
        int cons = 0;
        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                if (hour / 10 % 10 == min % 10 && hour % 10 == min / 10 % 10) {
                    cons++;
                    System.out.println(hour / 10 % 10 + " " + hour % 10 + " : " + min / 10 % 10 + " " + min % 10);
                }
            }
        }
        System.out.println("Количество совпадений: " + cons);
        System.out.println();

        // Задание 6. Найти максимальный и минимальные элементы массива и вывести их индексы на экран
        int i = 100;
        int min = 100, max = 0, indxMin = 0, indxMax = 0;
        int[] ar = new int[i];
        for (int j = 0; j < i; j++) {
            ar[j] = (int)(Math.random() * 101);
            if (ar[j] < min) {min = ar[j]; indxMin = j;}
            if (ar[j] > max) {max = ar[j]; indxMax = j;}
        }
        System.out.println("Минимум ar["+indxMin+"] = " + min + ", максимум ar["+indxMax+"] = " + max);
        System.out.println();

        // Задание 7. Создать массив заполнить его случайными элементами, распечать, перевернуть, и снова распечатать
        //При перевороте элементов не желательно создавать еще один массив
        i = 7;
        int[] turn = new int[i];
        int container;
        for (int j = 0; j < i; j++) {
            turn[j] = (int)(Math.random() * 101);
            System.out.print(turn[j]+" ");
        }
        System.out.println();
        for (int j = 0; j < i/2; j++) {
            container = turn[j];
            turn[j] = turn[(i-1)-j];
            turn[(i-1)-j] = container;
        }
        for (int j = 0; j < i; j++) {
            System.out.print(turn[j]+" ");
        }
        System.out.println();
        System.out.println();

        // Задание 8. Найти в строке все знаки препинания.
        //Подсчитать общее количество их.
        int count = 0;
        char sym;
        String str = "Задание, 8. Найти, в? строке! все, знаки препинания. Подсчитать, общее! количество их.";
        char[] punctuation = {'.', ',', '!', '?', ':', ';', '"', '\''};
        for (int k = 0; k < str.length(); k++) {
            sym = str.charAt(k);
            for (char a : punctuation) {
                if (sym == a) count++;
            }
        }
        System.out.println(str);
        System.out.println("В строке "+ count + " знаков препинания");

    }
}

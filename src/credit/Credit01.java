package credit;

public class Credit01 {
    public static void main(String[] args) {
        // Задание 1. Имеется прямоугольное отверстие размера a на b.
        //Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r
        double a = 3.0, b = 4.0, r = 2.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(r);
        if (r * r >= (a * a + b * b) / 4)
            System.out.println("Картонка с радиусом "+r+" закрывает полностью отверстие размера "+a+" * "+b);
        else System.out.println("Картонка с радиусом "+r+" не закрывает полностью отверстие размера "+a+" * "+b);
        // если нужно, чтобы вывод был именно таким, как в задании, без десятичной точки, нужно привети к int при выводе
        System.out.println();

        // Задание 2. Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
        int date = 28, month = 2, year = 2021;
        int visokos;
        int[] month30 = {4, 6, 9, 11};
        int[] month31 = {1, 3, 5, 7, 8, 10, 12};
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
        if (year % 4 == 0) { // определим високосность года
            if (year % 100 == 0 && year % 400 != 0) visokos = 0;
            else visokos = 1;
        }
        else visokos = 0; // определили
        // проверяем допустимость введенной комбинации месяца и даты
        if (month == 2) { // если февраль
            switch (visokos) {
                case 0:
                    if (date < 1 || date > 28) {
                        System.out.println("Введена неверная дата, исправьте"); System.exit(-1);
                    }
                    break;
                case 1:
                    if (date < 1 || date > 29) {
                        System.out.println("Введена неверная дата, исправьте"); System.exit(-1);
                    }
                    break;
            }
        }
        if (month < 1 || month > 12) {
            System.out.println("Введен неверный месяц, исправьте"); System.exit(-2);
        }
        for (int i : month30) {
            if (i == month && (date < 1 || date > 30)) {
                System.out.println("Введена неверная дата, исправьте"); System.exit(-1);
            }
        }
        for (int i : month31) {
            if (i == month && (date < 1 || date > 31)) {
                System.out.println("Введена неверная дата, исправьте"); System.exit(-1);
            }
        } // проверили допустимость введенной комбинации месяца и даты

        // если месяц не февраль и дата от 1 до 29 в любом месяце, то можно увеличить на 1. Месяц и год не изменяются
        if (month != 2) {
            if (date > 0 && date < 30) date++;
            else if (date == 30) {
                for (int i : month31) { // если дата=30,то для месяцев с 31 днем можно увеличить на 1
                    if (i == month) date++;
                }
                for (int i : month30) { // если дата=30, то для месяцев с 30 днями переходим в следующий месяц: date=1, month++
                    if (i == month) {
                        date = 1;
                        month++;
                    }
                }
            } else if (date == 31) { // если дата=31, то для месяцев с 31 днем, кроме 12, переходим в следующий месяц: date=1, month++
                for (int i : month31) {
                    if (i == 12) break;
                    if (i == month) {
                        date = 1;
                        month++;
                    }
                }
                if (month == 12) { // если число 31 и месяц = 12, то year++
                    date = 1;
                    month = 1;
                    year++;
                }
            }
        } else { //иначе (если месяц == 2)
            if ((date > 0 && date < 28) || (visokos==1 && date == 28)) date++;
            else if ((visokos==0 && date==28) || (visokos==1 && date==29)) {
                date = 1;
                month++;
            }
        }
        System.out.println(date+" "+month+" "+year);
    }
}

public class Exam04 {
    public static void main(String[] args) {
        // Задание 4. Создать двумерный квадратный массив размера n.
        //Заполнить его случайными числами таким образом:
        //числа по диагонали равны 0;
        //вверху и снизу от пересечения диагоналей находятся только положительные числа;
        //слева и справа от пересечения диагоналей находятся только отрицательные числа;
        //Вывести массив на экран.
        //Найти сумму всех элементов
        //Найти среднее арифметическое всех элементов, которые больше суммы всех элементов
        int n = 3; // размерность массива
        int[][] ar = new int[n][n];
        int sum = 0, moreAvg = 0, count = 0;
        for (int i = 0; i < n; i++){ // количество строк
            for (int j = 0; j < n; j++){ // количество столбцов
                if (i == j || i == n - 1 - j) ar[i][j] = 0; // заполнили диагонали нулями
                else if (((j >= i + 1) && (j <= n - 1 - i - 1)) || ((j < i) && (j >= n - i))) { // заполняем верхний и нижний треугольники одноразрядными целыми от 1 до 9
                    ar[i][j] = (int)(Math.random() * 9 + 1);
                }
                else if (((j <= i - 1) && (j < n - 1 - i)) || ((i >= n - j) && (i <= j - 1))) { // заполняем левый и правый треугольники одноразрядными целыми от -1 до -9
                    ar[i][j] = (int)(Math.random() * (-9) - 1);
                }
                sum += ar[i][j];
                System.out.printf("%3d", ar[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов = " + sum);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (ar[i][j] > sum) {
                    moreAvg += ar[i][j]; count++;
                }
            }
        }
        if (count > 0) System.out.println("Среднее арифметическое всех элементов, которые больше суммы всех элементов = " +
                (float)moreAvg / (float)count);
        else System.out.println("Все элементы меньше суммы; среднее арифметическое не считаем");
    }
}

package Study;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) throws IOException {
        LocalDate dateToday = LocalDate.now(); // remember today date for printing asterisk
        int dayToday = dateToday.getDayOfMonth();
        int monthToday = dateToday.getMonthValue();
        int yearToday = dateToday.getYear();
        Scanner scanYear = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanYear.nextInt();
        LocalDate date = LocalDate.of(year, 01, 01); // print calendar from the beginning of year
        year = date.getYear();
        System.out.println(year);
        while (date.getYear() == year) { // печатаемм месяцы, пока в границах текущего года
            System.out.println(date.getMonth());
            int month = date.getMonthValue();
            System.out.println("Mon Tue Wed Thu Fri Sat Sun");
            int firstDay = date.getDayOfWeek().getValue();
            for (int i = 1; i < firstDay; i++) {
                System.out.print("    ");
            }
            while (date.getMonthValue() == month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getMonthValue() == monthToday && date.getDayOfMonth() == dayToday && date.getYear() == yearToday) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) {
                    System.out.println();
                }
            }
            if (date.getDayOfWeek().getValue() != 1) {
                System.out.println();
            }
            System.out.println();
        }
    }
}

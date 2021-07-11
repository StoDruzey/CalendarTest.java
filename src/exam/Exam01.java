package exam;

import java.util.SplittableRandom;

public class Exam01 {
    public static void main(String[] args) {
        // Задание 1. Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды
        // Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды

        int seconds = 1114414;
        int hour, min, sec, day, week;
        String getSeconds = "секунд";
        String getMinutes = "минут";
        String getHours = "часов";
        String getDays = "дней";
        String getWeeks = "недель";

        sec = seconds % 60;
        min = seconds / 60 % 60;
        hour = seconds / 3600 % 24;
        day = seconds / 3600 / 24 % 7;
        week = seconds / 3600 / 24 / 7;

        // склоняем секунды
        if ((sec % 10 >= 2 && sec % 10 <= 4) && !(sec % 100 >= 12 && sec % 100 <= 14)) getSeconds = "секунды";
        else if (sec % 10 == 1 && sec % 100 != 11) getSeconds = "секунда";

        // склоняем минуты
        if ((min % 10 >= 2 && min % 10 <= 4) && !(min % 100 >= 12 && min % 100 <= 14)) getMinutes = "минуты";
        else if (min % 10 == 1 && min % 100 != 11) getMinutes = "минута";

        // склоняем часы
        if ((hour % 10 >= 2 && hour % 10 <= 4) && !(hour % 100 >= 12 && hour % 100 <= 14)) getHours = "часа";
        else if (hour % 10 == 1 && hour != 11) getHours = "час";

        // склоняем дни
        if (day % 10 >= 2 && day % 10 <= 4) getDays = "дня";
        else if (day % 10 == 1) getDays = "день";

        // склоняем недели
        if ((week % 10 >= 2 && week % 10 <= 4) && !(week % 100 >= 12 && week % 100 <= 14)) getWeeks = "недели";
        else if (week % 10 == 1 && week != 11) getWeeks = "неделя";

        System.out.println(seconds);
        System.out.println(hour + " " + getHours + " " + min + " " + getMinutes + " " + sec + " " + getSeconds);
        System.out.println(week + " " + getWeeks + " " + day + " " + getDays + " " + hour + " " + getHours + " " + min + " " + getMinutes + " " + sec + " " + getSeconds);
    }
}



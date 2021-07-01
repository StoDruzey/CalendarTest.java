package extra;

import java.util.SplittableRandom;

public class Exam01 {
    public static void main(String[] args) {
        // Задание 1. Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды
        // Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды

        int seconds = 3186399;
        int hour, min, sec, day, week;
        String getSeconds = new String();
        String getMinutes = new String();
        String getHours = new String();
        String getDays = new String();
        String getWeeks = new String();

        sec = seconds % 60;
        min = seconds / 60 % 60;
        hour = seconds / 3600 % 24;
        day = seconds / 3600 / 24 % 7;
        week = seconds / 3600 / 24 / 7;

        // склоняем секунды
        if (sec >= 11 && sec <= 20) getSeconds = "секунд";
        else if ((sec % 10 >= 5 && sec % 10 <= 9) ||  sec % 10 == 0) getSeconds = "секунд";
        else if (sec % 10 >= 2 && sec % 10 <= 4) getSeconds = "секунды";
        else if (sec % 10 == 1) getSeconds = "секунда";

        // склоняем минуты
        if (min >= 11 && min <= 20) getMinutes = "минут";
        else if ((min % 10 >= 5 && min % 10 <= 9) ||  min % 10 == 0) getMinutes = "минут";
        else if (min % 10 >= 2 && min % 10 <= 4) getMinutes = "минуты";
        else if (min % 10 == 1) getMinutes = "минута";

        // склоняем часы
        if (hour >= 11 && hour <= 20) getHours = "часов";
        else if ((hour % 10 >= 5 && hour % 10 <= 9) ||  hour % 10 == 0) getHours = "часов";
        else if (hour % 10 >= 2 && hour % 10 <= 4) getHours = "часа";
        else if (hour % 10 == 1) getHours = "час";

        // склоняем дни
        if ((day % 10 >= 5 && day % 10 <= 6) ||  day % 10 == 0) getDays = "дней";
        else if (day % 10 >= 2 && day % 10 <= 4) getDays = "дня";
        else if (day % 10 == 1) getDays = "день";

        // склоняем недели
        if (week % 100 >= 11 && week % 100 <= 20) getWeeks = "недель";
        else if ((week % 10 >= 5 && week % 10 <= 9) ||  week % 10 == 0) getWeeks = "недель";
        else if (week % 10 >= 2 && week % 10 <= 4) getWeeks = "недели";
        else if (week % 10 == 1) getWeeks = "неделя";

        System.out.println(seconds);
        System.out.println(hour + " " + getHours + " " + min + " " + getMinutes + " " + sec + " " + getSeconds);
        System.out.println(week + " " + getWeeks + " " + day + " " + getDays + " " + hour + " " + getHours + " " + min + " " + getMinutes + " " + sec + " " + getSeconds);
    }
}



import java.util.Locale;

public class Exam05 {
    public static void main(String[] args) {
        // Задание 5. Имеется строка с текстом. Подсчитайте уникальное количество слов в тексте.
        //Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
        //Пробелы могут присутствовать в начале и конце текста.
        //Примеры уникальности: dog и Dog - одинаковые dog и dogs - разные
        String searchWords = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.";
        System.out.println(searchWords);
        char c;
        int countChar = 0, countWords = 0, countUniqWords = 0;
        for (int i = 0; i < searchWords.length(); i++) { //сначала найдем колиество слов, чтобы определить размер массива
            c = searchWords.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') countChar++;
            else if (countChar > 0) {countWords++; countChar = 0;}
            else countChar = 0;
        }
        if (countWords == 0) {System.out.println("В строке нет слов"); System.exit(-1);}

        String[] words = new String[countWords]; // создадим массив слов, чтобы можно было их сравнить
        for (int i = 0; i < countWords; i++) words[i] = ""; // инициализация массива пустыми строками
        int i = 0; // перебираем символы в строке от начала до конца
        for (int w = 0; w < countWords; w++) { //заполним массив словами
            for (; i < searchWords.length(); i++) {
                c = searchWords.charAt(i);
                if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {countChar++; words[w] += c;}
                else if (countChar > 0) {countChar = 0; break;}
                else countChar = 0;
            }
        }
        boolean match = false; // индикатор совпадений
        for (int k = 0; k < countWords; k++) {//переберем все слова, ищем совпадения
            for (int j = k + 1; j < countWords; j++) { // сравниваем предыдущее слово со следующим по порядку до конца
                if (!words[k].isEmpty() && words[k].equalsIgnoreCase(words[j])) {
                    words[j] = "";
                    match = true; //если нашли совпадение, возвращаем в массив пустую строку и ищем дальше
                }
            }
            if (match == true) {
                words[k] = ""; //после нахождения всех совпадений возвращаем пустую строку вместо первого слова
                match = false;
            }
        }
        for (String s : words) {
            if (!s.isEmpty()) {
                countUniqWords++;
                System.out.print(s + " ");
            }
        }
        System.out.println();
        System.out.println("Уникальных слов " + countUniqWords);
    }
}

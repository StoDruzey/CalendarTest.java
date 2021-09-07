package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exam05new {
    public static void main(String[] args) {
        // Задание 5. Имеется строка с текстом. Подсчитайте уникальное количество слов в тексте.
        //Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
        //Пробелы могут присутствовать в начале и конце текста.
        //Примеры уникальности: dog и Dog - одинаковые dog и dogs - разные
        String str = "Listen listen to To the news from today and ? read the text !at the same time. Listen to the news from today without reading the text.";
        String[] strWords = str.toLowerCase().split("\\s*(\\s|,|\"|'|\\?|!|\\.)\\s*");
        List<String> words = Arrays.asList(strWords);

        System.out.println("Количество уникальных слов в строке: " +
                words.stream()
                .filter(s -> Collections.frequency(words, s) == 1)
                .collect(Collectors.toList())
                .stream().count());

    }
}

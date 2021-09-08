package exam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exam05new {
    public static void main(String[] args) {
        // Задание 5. Имеется строка с текстом. Подсчитайте уникальное количество слов в тексте.
        //Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
        //Пробелы могут присутствовать в начале и конце текста.
        //Примеры уникальности: dog и Dog - одинаковые dog и dogs - разные
        String str = "Listen listen to To the news from today and ? read the text !at the same time. Listen to the news from today without reading the text.";
        String[] strWords = str.toLowerCase().split("\\s*(\\s|,|\"|'|\\?|!|\\.)\\s*");
        int count = 0; //счетчик уникальных слов
        Map<String, Long> words = Arrays
                .stream(strWords)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Уникальные слова в строке: ");
        for(Map.Entry<String, Long> w : words.entrySet()) {
            if (w.getValue() == 1) {
                count++;
                System.out.println(w.getKey());
            }
        }
        System.out.println("Количество уникальных слов в строке: " + count);

        // 2й путь, мне он меньше нравится, потому что я его нагуглил
        List<String> listWords = Arrays.asList(strWords);
        System.out.println("2й путь: Количество уникальных слов в строке: " +
                listWords.stream()
                .filter(s -> Collections.frequency(listWords, s) == 1)
                .collect(Collectors.toList())
                .stream().count());
    }
}

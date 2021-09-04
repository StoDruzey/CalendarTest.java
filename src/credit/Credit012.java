package credit;
//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
import java.io.*;
import java.util.Scanner;

public class Credit012 {
    public static void main(String[] args) {
        String text = "public final class Scanner\n" +
                "extends Object\n" +
                "implements Iterator<String>, Closeable\n" +
                "A simple text scanner which can parse primitive types and strings using regular expressions.\n" +
                "A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. " +
                "The resulting tokens may then be converted into values of different types using the various next methods.";

        // открываем файл и пишем в него строку
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter("test.txt"))) {
            fileWriter.write(text);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        // запись файла закончена
        // чтение файла
        File file = new File("test.txt");
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int count = 0, countPunct = 0;
        String word;
        char sym;
        char[] punctuation = {'.', ',', '!', '?', ':', ';', '"', '\''};
        while (input.hasNext()) { // читаем из файла "токены" - слова со знаками препинания
            word  = input.next();
//            System.out.println(word);
            for (int i = 0; i < word.length(); i++) { // находим и считаем знаки препинания
                sym = word.charAt(i);
                for (char a : punctuation) {
                    if (sym == a) countPunct++;
                }
            }
            count++;
        }
        System.out.println("Word count: " + count);
        System.out.println("Punctuation count: " + countPunct);
    }
}

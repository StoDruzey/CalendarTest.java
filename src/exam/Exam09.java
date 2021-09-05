package exam;
//        Даны 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000.
//        Создайте файл out.txt, который будет содержать все отсортированные числа из файлов in1.txt и in2.txt.
//        Файлы in1.txt и in2.txt можно создать с помощью кода.
import java.io.*;
import java.util.*;
import java.util.function.Consumer;

interface FileWritable {
    void fileWrite(String fileName);
}

interface FileReadable {
    void fileRead(String fileName, List<Integer> digits);
}

public class Exam09 {
    public static void main(String[] args) {
        String fileIn1 = "in1.txt", fileIn2 = "in2.txt", fileOut = "out.txt";

        FileWritable fileW = fileName -> {
            try(BufferedWriter fw = new BufferedWriter(new FileWriter(fileName))) {
                for(int i = 0; i < 1000; i++) {
                    int digit = (int)(Math.random() * 100001 + 1);
                    fw.write(Integer.toString(digit) + "\n");
                }
            } catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("File " + fileName + " is generated");
        };
        // генерируем файлы с числами
        fileW.fileWrite(fileIn1);
        fileW.fileWrite(fileIn2);

        List<Integer> digits = new ArrayList<>();

        // читаем сгенерированные файлы в List
        FileReadable fileR = (fileName, dig) -> {
            try(BufferedReader fr = new BufferedReader (new FileReader(fileName))) {
                String s;
                while((s = fr.readLine()) != null) {
                    dig.add(Integer.parseInt(s));
                }
            } catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
        };
        fileR.fileRead(fileIn1, digits);
        fileR.fileRead(fileIn2, digits);

        // сортируем коллекцию
        Collections.sort(digits);
        System.out.println("Collection is sorted");

        // открываем итоговый файл и пишем в него числа
        try(BufferedWriter fw = new BufferedWriter(new FileWriter(fileOut))) {
            digits.forEach(new Consumer<Integer>() {
                @Override
                public void accept(Integer dig) {
                    try {fw.write(Integer.toString(dig) + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        // запись итогового файла закончена
        System.out.println("Final file " + fileOut + " successfully generated");
    }
}


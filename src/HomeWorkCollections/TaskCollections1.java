package HomeWorkCollections;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskCollections1 {

    static long count = 0;
    static int symbol;
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        readFile();
        String line = String.valueOf(stringBuilder);
        System.out.println("Слова отсортированные по алфавиту + сколько раз они встречаются в тексте:");
        printFullList(line);
        System.out.println("\nНаиболее часто встречающиеся слова:");
        printMaxValuesOfList(line);

    }
    public static void readFile(){
        try {
            File file = new File("D:/test/file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((symbol = bufferedReader.read()) != -1) {
                stringBuilder.append((char) symbol);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printFullList(String line){
        Stream.of(line.split("[^A-Za-zА-Яа-я0-9]+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
    public static void printMaxValuesOfList(String line){
        Map<String, Long> map;
        map = Stream.of(line.split("[^A-Za-zА-Яа-я0-9]+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String, Long> m : map.entrySet()) {
            if (m.getValue() > count) {
                count = m.getValue();
            }
        }
        for (Map.Entry<String, Long> m : map.entrySet()) {
            if (m.getValue() == count) {
                System.out.println(m);
            }
        }
    }
}





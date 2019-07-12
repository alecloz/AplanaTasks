package HomeWorkCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class TaskCollections2 {
    private String key;
    private int value;
    private static ArrayList<TaskCollections2> list = new ArrayList<>();
    private static StringBuilder stringBuilder = new StringBuilder();
    private static String line;
    private static String fileName = "file.txt";

    private TaskCollections2(String key, int value) {
        this.key = key;
        this.value = value;
    }

    private int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    private void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        MyComparatorKey myComparatorKey = new MyComparatorKey();
        MyComparatorValue myComparatorValue = new MyComparatorValue();
        readFile();
        fillingList(line);
        list.sort(myComparatorKey);
        System.out.println("Слова отсортированные по алфавиту + сколько раз они встречаются в тексте:");
        printList();
        list.sort(myComparatorValue);
        Collections.reverse(list);
        System.out.println("\nНаиболее часто встречающиеся слова:");
        maxValuesOfList();

    }
    private static void readFile() {
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int symbol;
            while ((symbol = bufferedReader.read()) != -1) {
                stringBuilder.append((char) symbol);
            }
            line = String.valueOf(stringBuilder);
            if (line.equals("")){
                System.out.println("Файл пустой");
                System.exit(0);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void printList() {
        for (TaskCollections2 taskCollections2 : list) {
            System.out.println(taskCollections2);
        }
    }
    private static void maxValuesOfList() {
        int maxValue = list.get(0).getValue();
        for (TaskCollections2 t : list) {
            if (t.getValue() == maxValue){
                System.out.println(t);
            }
        }
    }
    private static void fillingList(String line) {
        int num;
        String[] strings = line.split("[^A-Za-zА-Яа-я0-9]+");
        for (String string : strings) {
            TaskCollections2 taskCollections2 = new TaskCollections2(string, 1);
            if (list.contains(taskCollections2)) {
                num = list.indexOf(taskCollections2);
                if (list.get(num).getKey().equals(taskCollections2.getKey())){
                    list.get(num).setValue(list.get(num).getValue() + 1);
                }
            } else {
                list.add(taskCollections2);
            }
        }
    }
    @Override
    public String toString() {
        return key + "=" + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskCollections2 that = (TaskCollections2) o;
        return Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    private static class MyComparatorKey implements Comparator<TaskCollections2> {
        @Override
        public int compare(TaskCollections2 o1, TaskCollections2 o2) {
            return o1.key.compareTo(o2.key);
        }
    }

    private static class MyComparatorValue implements Comparator<TaskCollections2> {
        @Override
        public int compare(TaskCollections2 h1, TaskCollections2 h2) {
            return Integer.compare(h1.value, h2.value);
        }
    }
}


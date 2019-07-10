package HomeWorkCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class TaskCollections2 {
    String key;
    int value;
    static ArrayList<TaskCollections2> list = new ArrayList<>();
    static StringBuilder stringBuilder = new StringBuilder();
    static int symbol;

    public TaskCollections2(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        MyComparatorKey myComparatorKey = new MyComparatorKey();
        MyComparatorValue myComparatorValue = new MyComparatorValue();
        readFile();
        String line = String.valueOf(stringBuilder);
        fillingList(line);
        list.sort(myComparatorKey);
        deleteDublicates();
        System.out.println("Слова отсортированные по алфавиту + сколько раз они встречаются в тексте:");
        printList();
        list.sort(myComparatorValue);
        Collections.reverse(list);
        System.out.println("\nНаиболее часто встречающиеся слова:");
        maxValuesOfList();

    }
    static public void readFile() {
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
    static public void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static public void maxValuesOfList() {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getValue() != list.get(i + 1).getValue()) {
                System.out.println(list.get(i));
                break;
            } else {
                System.out.println(list.get(i));
            }
        }
    }
    static public void deleteDublicates() {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getKey().equals(list.get(i + 1).getKey())) {
                list.get(i).setValue(list.get(i).getValue() + 1);
                list.remove(list.get(i + 1));
                i--;
            }
        }
    }
    static public void fillingList(String line) {
        String[] strings = line.split("[^A-Za-zА-Яа-я0-9]+");
        for (int i = 0; i < strings.length; i++) {
            TaskCollections2 taskCollections2 = new TaskCollections2(strings[i].toLowerCase(), 1);
            list.add(taskCollections2);
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
        return value == that.value &&
                Objects.equals(key, that.key);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    static class MyComparatorKey implements Comparator<TaskCollections2> {
        @Override
        public int compare(TaskCollections2 o1, TaskCollections2 o2) {
            return o1.key.compareTo(o2.key);
        }
    }

    static class MyComparatorValue implements Comparator<TaskCollections2> {
        @Override
        public int compare(TaskCollections2 h1, TaskCollections2 h2) {
            if (h1.value == h2.value) {
                return 0;
            }
            if (h1.value > h2.value) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
//

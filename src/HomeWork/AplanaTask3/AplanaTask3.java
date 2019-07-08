package HomeWork.AplanaTask3;

import java.util.*;

public class AplanaTask3 {
    public static void main(String[] args) {
        ComparatorStrings comparatorStrings = new ComparatorStrings();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        sortirovka(s, comparatorStrings);

    }
    public static void sortirovka(String s, Comparator comparator){
        String[] str = s.split("[^A-Za-zА-Яа-я0-9]+");
        List<String> list = new ArrayList<>(Arrays.asList(str));
        Collections.sort(list, comparator);
        Collections.reverse(list);
        System.out.println(list);
    }

    static class ComparatorStrings implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            if (s1.length() == s2.length()) {
                return 0;
            }
            if (s1.length() > s2.length()) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}

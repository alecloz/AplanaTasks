package HomeWork.AplanaTask1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AplanaTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String str = udalenieSimvolovPovtorov(first);
        String str2 = udalenieSimvolovPovtorov(second);
        unikalnyiSimvolyDvuhStrok(str, str2);


        }
    public static String udalenieSimvolovPovtorov(String s){
        String strokaIzUnikalnyhiSimvolov = "";
        Map<String, Long> charCount;
        String[] strings = s.split("");

        charCount = Stream.of(strings)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Iterator<Map.Entry<String, Long>> iterator = charCount.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Long> pair = iterator.next();
            if (pair.getValue() > 1){
                iterator.remove();
            }
            else {
                strokaIzUnikalnyhiSimvolov += pair.getKey();
            }
        }
        return strokaIzUnikalnyhiSimvolov;
    }
    public static void unikalnyiSimvolyDvuhStrok(String s1, String s2){
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    System.out.println(s1.charAt(i));
                }
            }
        }
    }
}

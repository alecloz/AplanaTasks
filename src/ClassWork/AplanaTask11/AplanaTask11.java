package ClassWork.AplanaTask11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AplanaTask11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        System.out.println(binari(i1));
    }

    public static int binari(int i) {
        int sum = 0;
        int multiply = 1;
        int length = String.valueOf(i).length();
        String str = String.valueOf(i);
        char[] strToArray = str.toCharArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < strToArray.length; j++) {
            arrayList.add(Character.digit(strToArray[j],10));
        }
        Collections.reverse(arrayList);

        for (int j = 0; j < length; j++) {
            if (arrayList.get(j) == 1){
                sum += multiply;
            }
            multiply *= 2;
        }
        return sum;
    }
}
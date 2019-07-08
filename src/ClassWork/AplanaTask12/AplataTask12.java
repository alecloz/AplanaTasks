package ClassWork.AplanaTask12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AplataTask12 {
    public static void main(String[] args) {
        maxMinReverseRandom();
    }

    public static void maxMinReverseRandom() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21) - 10;
        }
        System.out.println("Элементы до: " + "\n" + Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int min = Collections.min(list);
        int max = Collections.max(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min){
                list.set(i, max);
            }
            else if (list.get(i) == max){
                list.set(i, min);
            }
        }
        System.out.println("Элементы после: "  + "\n" + list);


    }
}

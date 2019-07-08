package HomeWork.AplanaTask5;

import java.util.Arrays;
import java.util.Scanner;

public class AplanaTask5 {

    static int middle;
    static int[] array1;
    static int[] array2;
    static int[] arr;
    static int sumArray1 = 0;
    static int sumArray2 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        try {
            int lengthArray = scanner.nextInt();
            arrayGenerator(lengthArray);
        }catch (Exception e){
            System.err.println("Некорректный ввод данных. Введите четное число...");
            System.exit(0);
        }
        for (int i = 0; i < middle; i++) {
            array1[i] = arr[i];
            sumArray1 += array1[i];
        }
        for (int i = middle; i < arr.length; i++) {
            array2[i - middle] = arr[i];
            sumArray2 += array2[i - middle];
        }

        System.out.println("Итоговые массивы:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println("Суммы итоговых массивов: \n" + sumArray1 + "\n" + sumArray2);
    }
    public static void arrayGenerator(int num){
        arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000) - 5000;
        }
        System.out.println("Полученный массив:");
        System.out.println(Arrays.toString(arr));
        if (arr.length % 2 == 0) {
            middle = arr.length / 2;
            array1 = new int[middle];
            array2 = new int[middle];
        }
        else {
            System.err.println("Увы количество элементов нечетное. Поровну разделить не получится. Попробуйте ещё...");
            System.exit(0);
        }
    }
}

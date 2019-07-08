package HomeWork.AplanaTask4;

import java.util.*;

public class AplanaTask4 {

    static int[] arr1;
    static int[] arr2;
    static Integer[] result;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер первого массива:");
        int arrayLength1 = scanner.nextInt();
        System.out.println("Введите размер второго массива:");
        int arrayLength2 = scanner.nextInt();

        arr1 = new int[arrayLength1];
        arr2 = new int[arrayLength2];

        System.out.println("Заполнение массивов целочисленными элементами от -5000 до 5000:");
        zapolnenie(arr1);
        zapolnenie(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Получение середин массивов:");
        Integer[] newIntegerArray1 = intToIntegerArray(setArray(arr1));
        Integer[] newIntegerArray2 = intToIntegerArray(setArray(arr2));
        System.out.println(Arrays.toString(newIntegerArray1));
        System.out.println(Arrays.toString(newIntegerArray2));

        System.out.println("Объединение и перемешивание массивов:");
        result = togetherArray(newIntegerArray1, newIntegerArray2);

        System.out.println(Arrays.toString(getArray()));

    }

    public static int[] zapolnenie(int[] array){

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000) - 5000;
        }
        return array;
    }

    public static int[] setArray(int[] array){

        int value = array.length / 2;
        int firstIndex = value / 2;
        int secondIndex = value + firstIndex;
        return Arrays.copyOfRange(array, firstIndex, secondIndex + 1);
    }

    public static Integer[] getArray(){
        return result;
    }

    public static Integer[] intToIntegerArray(int[] arr){
        Integer[] array = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    public static Integer[] togetherArray (Integer[] array1, Integer[] array2){
        Arrays.asList(array1);
        Arrays.asList(array2);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        Collections.shuffle(list);
        Integer[] resultArray = new Integer[list.size()];
        list.toArray(resultArray);
        return resultArray;
    }
}

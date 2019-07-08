package ClassWork.AplanaTask14;

import java.util.*;

public class AplanaTask14 {

    static Scanner scanner = new Scanner(System.in);
    static String[] strArr;
    static int arrLength;

    public static void main(String[] args) {
        arrLength = getArrLength();
        strArr = new String[arrLength];
        getFullArr();
        minAndMaxStrings();
    }
    public static int getArrLength(){
        System.out.println("Введите размер массива:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getArrLength();
        }
        return num;
    }
    public static String[] getFullArr(){
        System.out.println("Введите строки в количестве равному размеру массива:");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scanner.next();
        }
        return strArr;
    }
    public static void minAndMaxStrings(){
        List<String> strings = new ArrayList<>(Arrays.asList(strArr));
        StringLengthSort stringLengthSort = new StringLengthSort();
        Collections.sort(strings, stringLengthSort);
        System.out.println("Минимальный элемент: " + strings.get(0));
        System.out.println("Максимальный элемент: " + strings.get(strings.size() - 1));
    }

    static class StringLengthSort implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            if(o1.length() > o2.length()){
                return 1;
            }else{
                if(o1.length() < o2.length()){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
}

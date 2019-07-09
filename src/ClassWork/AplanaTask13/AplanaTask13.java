package ClassWork.AplanaTask13;

import java.util.Scanner;

public class AplanaTask13 {

    static int num1;
    static int num2;
    static char operation;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strArr = s.split(" ");
        operation = strArr[0].charAt(0);
        try {
            num1 = Integer.parseInt(strArr[1]);
            num2 = Integer.parseInt(strArr[2]);
        }catch (Exception e){
            System.out.println("Введите целочисленное значение");
            System.exit(0);
        }
        calc(operation);

    }
    public static void calc(char operation) {
        if (operation == '/'){
            if (num2 == 0){
                System.out.println("Делить на ноль нельзя");
            }
            else
                div(num1, num2);
        }
        if (operation == '*'){
            mul(num1, num2);
        }
        if (operation == '+'){
            sum(num1, num2);
        }
        if (operation == '-'){
            dif(num1, num2);
        }
    }

    public static void div(int num1, int num2) {
        System.out.println("Результат операции: " + (num1/num2));
    }
    public static void mul(int num1, int num2) {
        System.out.println("Результат операции: " + (num1*num2));
    }
    public static void sum(int num1, int num2) {
        System.out.println("Результат операции: " + (num1+num2));
    }
    public static void dif(int num1, int num2) {
        System.out.println("Результат операции: " + (num1-num2));
    }
}



package ClassWork.AplanaTask13;

import java.util.Scanner;

public class AplanaTask13 {

    static Scanner scanner = new Scanner(System.in);
    static int num1;
    static int num2;

    public static void main(String[] args) {
        num1 = getInt();
        num2 = getInt();
        getOperation();
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static void getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
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
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            getOperation();
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


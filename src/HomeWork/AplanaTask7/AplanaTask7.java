package HomeWork.AplanaTask7;

import java.util.Scanner;

public class AplanaTask7 {
    static final int MY_BIRTHDAY = 27;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день вашего рождения:");
        int day;
        try {
            day = scanner.nextInt();
            if (day >= 1 && day <= 31) {
                shtraf(day);
            }
            else {
                System.out.println("Введите число от 1 до 31");
            }
        }catch (Exception e){
            System.out.println("Введите число от 1 до 31");
        }

    }
    public static int shtraf(int birthday){
        int speed = 1 + (int) (Math.random() * 241);
        if (birthday == MY_BIRTHDAY) {
            if (speed <= 65) {
                System.out.println("Ваша скорость равна " + speed + ", у вас день рождения, штрафа нет");
                return 0;
            }
            else if (speed > 65 && speed <= 85 ){
                System.out.println("Ваша скорость равна " + speed + ", у вас день рождения, штраф маленький");
                return 1;
            }
            else {
                System.out.println("Ваша скорость равна " + speed + ", у вас день рождения, штраф большой");
                return 2;
            }
        }
        else {
            if (speed <= 60) {
                System.out.println("Ваша скорость равна " + speed + ", штрафа нет");
                return 0;
            } else if (speed > 60 && speed <= 80) {
                System.out.println("Ваша скорость равна " + speed + ", штраф маленький");
                return 1;
            } else {
                System.out.println("Ваша скорость равна " + speed + ", штраф большой");
                return 2;
            }
        }
    }
}

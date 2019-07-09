package HomeWork.AplanaTask2;

import java.util.Random;

public class AplanaTask2 {
    public static void main(String[] args) {
        Random r = new Random();
        String s = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 4; i++) {
            s += (int) (Math.random() * 10);
        }
        for (int i = 0; i < 2; i++) {
            s += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        int random = (int) (Math.random() * 4); //узнаем под каким индексом далее будет точно сгенерирована еденица
        for (int i = 0; i < 4; i++) {
            if (random == i) {
                s += 1;
            } else {
                s += (int) (Math.random() * 2);
            }
        }
        System.out.println(s);
    }
}

package ClassWork.AplanaTask15;

import java.util.ArrayList;

public class AplanaTask15 {

    static int weightSum;
    static int priceSum;
    public static void main(String[] args) {
        ArrayList<Sweet> sweets = new ArrayList<>();
        sweets.add(new RotFront("Рот Фронт", 150, 200));
        sweets.add(new KaraKum("Каракум", 200, 300));
        sweets.add(new Korkunov("Коркунов", 500, 320));
        sweets.add(new KrasnaiaShapochka("Красная Шапочка", 220, 400));
        sweets.add(new MishkaKosolapyi("Мишка Косолапый", 100, 240));
        sweets.add(new Jelibony("Желибоны", 50, 50));
        sweets.add(new Vdohnovenie("Вдохновение", 180, 90));

        weightSum(sweets);
        getPriceSum(sweets);
        Present present = new Present(weightSum, priceSum, sweets);
        System.out.println(present);

    }
    public static int weightSum(ArrayList<Sweet> list){
        for (Sweet sweet : list) {
            weightSum += sweet.weight;
        }
        return weightSum;
    }
    public static int getPriceSum(ArrayList<Sweet> list){
        for (Sweet sweet : list) {
            priceSum += sweet.price;
        }
        return priceSum;
    }
}

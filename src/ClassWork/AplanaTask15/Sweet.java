package ClassWork.AplanaTask15;

public abstract class Sweet {
    String name;
    int price;
    int weight;
    int ID;
    static int count = 0;


    public Sweet(String name, int price, int weight) {
        count++;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.ID = count;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", ID=" + ID +
                '}';
    }
}
class RotFront extends Sweet {

    public RotFront(String name, int price, int weight) {
        super(name, price, weight);
    }
}
class Korkunov extends Sweet {

    public Korkunov(String name, int price, int weight) {
        super(name, price, weight);
    }
}
class KaraKum extends Sweet {

    public KaraKum(String name, int price, int weight) {
        super(name, price, weight);
    }
}
class KrasnaiaShapochka extends Sweet {

    public KrasnaiaShapochka(String name, int price, int weight) {
        super(name, price, weight);
    }
}
class MishkaKosolapyi extends Sweet {

    public MishkaKosolapyi(String name, int price, int weight) {
        super(name, price, weight);
    }
}
class Vdohnovenie extends Sweet {

    public Vdohnovenie(String name, int price, int weight) {
        super(name, price, weight);
    }
}
class Jelibony extends Sweet {

    public Jelibony(String name, int price, int weight) {
        super(name, price, weight);
    }
}

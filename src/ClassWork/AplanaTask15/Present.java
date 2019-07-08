package ClassWork.AplanaTask15;

import java.util.ArrayList;

public class Present {
    int weight;
    int price;
    ArrayList<Sweet> sweets;

    public Present(int weight, int price, ArrayList<Sweet> sweets) {
        this.weight = weight;
        this.price = price;
        this.sweets = sweets;
    }

    @Override
    public String toString() {
        return "Present{" +
                "weight=" + weight +
                ", price=" + price +
                ", sweets=" + sweets +
                '}';
    }
}

package HomeWork.AplanaTask9;

import java.sql.Time;
import java.util.*;
import java.util.stream.Stream;

public class Train {
    String destination;
    int numberOfTrain;
    Time time;

    public Train(String destination, int numberOfTrain, Time time) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.time = time;
    }

    public static void main(String[] args) {
        Train[] trains = new Train[]{new Train("Москва", 73, new Time(12, 30, 0)),
                new Train("Санкт-Петербург", 114, new Time(0, 5, 0)),
                new Train("Якутск", 50, new Time(14, 25, 0)),
                new Train("Екатеринбург", 13, new Time(13, 50, 0)),
                new Train("Тула", 261, new Time(7, 15, 0))};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер поезда:");
        int numberTrain = scanner.nextInt();
        System.out.println("Информация о вашем поезде:");
        informationOfTrain(numberTrain, trains);

        System.out.println("\nОтсортируем поезда:");
        System.out.println("\nДо сортировки:");
        printTrains(trains);
        System.out.println("\nПосле сортировки:");
        printTrains(sortTrains(trains));
    }

    public static void informationOfTrain(int i, Train[] trains){
        for (int j = 0; j < trains.length; j++) {
            if (trains[j].numberOfTrain == i){
                System.out.println(trains[j]);
            }
        }
    }

    public static Train[] sortTrains(Train[] trains){
        TrainComparator trainComparator = new TrainComparator();
        ArrayList<Train> listOfTrains = new ArrayList<>(Arrays.asList(trains));
        Collections.sort(listOfTrains, trainComparator);
        Train[] trainsArr = new Train[listOfTrains.size()];
        listOfTrains.toArray(trainsArr);
        return trainsArr;
    }

    public static void printTrains(Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberOfTrain=" + numberOfTrain +
                ", time=" + time +
                '}';
    }

    static class TrainComparator implements Comparator<Train> {

        @Override
        public int compare(Train t1, Train t2) {
            int res = t1.destination.compareTo(t2.destination);{
                if (res == 0){
                    res = t1.time.compareTo(t2.time);
                }
            }
            return res;
        }
    }
}

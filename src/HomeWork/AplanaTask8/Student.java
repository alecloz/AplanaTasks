package HomeWork.AplanaTask8;

import java.util.*;
import java.util.stream.IntStream;

public class Student {
    String fullName;
    int numberOfGroup;
    int[] rating;

    public Student(String fullName, int numberOfGroup, int[] rating) {
        this.fullName = fullName;
        this.numberOfGroup = numberOfGroup;
        this.rating = rating;
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Pupkin A.O.", 1, new int[]{1, 2, 3, 4, 5}),
                new Student("Taburetkin K.T.", 1, new int[]{2, 2, 3, 3, 5}),
                new Student("Ivanov I.I.", 1, new int[]{3, 2, 3, 4, 3}),
                new Student("Petrov M.A.", 2, new int[]{4, 4, 4, 4, 4}),
                new Student("Sidorov O.O.", 2, new int[]{5, 5, 5, 4, 5}),
                new Student("Ivanova A.A.", 2, new int[]{4, 4, 4, 3, 5}),
                new Student("Petrova O.O.", 3, new int[]{4, 2, 3, 4, 5}),
                new Student("Sidorova R.O.", 3, new int[]{3, 3, 3, 5, 3}),
                new Student("Pikachu L.P.", 3, new int[]{4, 1, 5, 4, 5}),
                new Student("Telepuzik L.J.", 3, new int[]{5, 4, 2, 4, 5})};
        System.out.println("Список студентов: ");
        System.out.println(Arrays.toString(students));
        CompareStudents compareStudents = new CompareStudents();
        List<Student> list = new ArrayList<>(Arrays.asList(students));
        list.sort(compareStudents);
        System.out.println("\nСписок студентов отсортированных по среднему балу: ");
        System.out.println(list);
        otlichniki(list);

    }

    public static void otlichniki(List<Student> list){
        System.out.println("\nСписок студентов у которых оценки не ниже 4: ");
        for (Student student : list) {
            if (IntStream.of(student.rating).allMatch(x -> x >= 4)){
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", numberOfGroup=" + numberOfGroup +
                ", rating=" + Arrays.toString(rating) +
                '}';
    }

    static class CompareStudents implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            double first  = IntStream.of(o1.rating).average().getAsDouble();
            double second  = IntStream.of(o2.rating).average().getAsDouble();
            if (first == second) {
                return 0;
            } else if (first < second) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

package HomeWork.AplanaTask10;

import HomeWork.AplanaTask9.Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Customer {
    private String lastName;
    private String firstName;
    private String poBatushkeName;
    private String address;
    private long creditCardNumber;
    private long bankAccountNumber;

    public Customer(String lastName, String firstName, String poBatushkeName, String address, long creditCardNumber, long bankAccountNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.poBatushkeName = poBatushkeName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPoBatushkeName(String poBatushkeName) {
        this.poBatushkeName = poBatushkeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPoBatushkeName() {
        return poBatushkeName;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", poBatushkeName='" + poBatushkeName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    public static void main(String[] args) {
        Customer[] customers = new Customer[]{new Customer("Пупкин", "Залог", "Успехов", "Москва, ул.Ленина, 1", 123456789311L, 123456789123L),
                new Customer("Табуреткин", "Отряд", "Ковбоев", "Москва, ул.Пушкина, 2", 123654789654L, 321456987456L),
                new Customer("Стулкин", "Развод", "Супругов", "Москва, ул.Лермонтова, 3", 547896321496L, 458963012493L),
                new Customer("Пикачу", "Побег", "Злодеев", "Москва, ул.Есенина, 4", 214763498037L, 712437946120L),
                new Customer("Волков", "Поджог", "Сараев", "Москва, ул.Гоголя, 5", 654703126984L, 486320197643L),
        };
        System.out.println("Выводим массив с клиентами:");
        printCustomers(customers);
        System.out.println("\nСортируем клиентов по алфавиту:");
        printCustomers(sortCustomersAlphabet(customers));
        System.out.println("\nВыводим клиентов у которых номера карточек в диапазоне от 200000000000 до 400000000000:");
        printCustomers(sortCustomersCreditCardNumberRange(customers));

    }

    public static Customer[] sortCustomersAlphabet(Customer[] customers){
        TrainComparator trainComparator = new TrainComparator();
        ArrayList<Customer> listCustomers = new ArrayList<>(Arrays.asList(customers));
        listCustomers.sort(trainComparator);
        Customer[] arrayCustomers = new Customer[listCustomers.size()];
        listCustomers.toArray(arrayCustomers);
        return arrayCustomers;

    }

    public static Customer[] sortCustomersCreditCardNumberRange(Customer[] customers){
        ArrayList<Customer> creditCardSort = new ArrayList<>();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].creditCardNumber > 200000000000L && customers[i].creditCardNumber < 400000000000L){
                creditCardSort.add(customers[i]);
            }
        }
        Customer[] arrayCustomers = new Customer[creditCardSort.size()];
        creditCardSort.toArray(arrayCustomers);
        return arrayCustomers;
    }

    public static void printCustomers(Customer[] customers){
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }

    static class TrainComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer с1, Customer с2) {
            int res = с1.lastName.compareTo(с2.lastName);{
                if (res == 0){
                    res = с1.firstName.compareTo(с2.firstName);
                    if (res == 0){
                        res = с1.poBatushkeName.compareTo(с2.poBatushkeName);
                    }
                }
            }
            return res;
        }
    }
}

package Week_02.Day_05.hybridinheritance.restaurantmanagementsystem;
// waiter extends features of Person and implements features of Worker
public class Waiter extends Person implements Worker{
    public Waiter(String name, int age) {
        super(name, age); // call super class constructor
    }
    // override method from interface to extend its features
    @Override
    public void performDuties() {
        System.out.println("Waiter Name: "+ name);
        System.out.println("Waiter age: "+ age);
        System.out.println("Waiter handle guests!!!");
        System.out.println();
    }
}

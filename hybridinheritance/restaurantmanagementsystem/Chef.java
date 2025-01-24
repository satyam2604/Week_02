package Week_02.Day_05.hybridinheritance.restaurantmanagementsystem;
// chef extends features of Person and implements features of Worker
public class Chef extends Person implements Worker{
    public Chef(String name, int age) {
        super(name, age); // call super clas constructor
    }
    // override method from an interface to extend its features
    @Override
    public void performDuties() {
        System.out.println("Chef Name: "+ name);
        System.out.println("Chef age: "+ age);
        System.out.println("Chef performs cooking!!!");
        System.out.println();
    }
}

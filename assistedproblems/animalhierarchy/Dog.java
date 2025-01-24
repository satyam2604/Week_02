package Week_02.Day_05.assistedproblems.animalhierarchy;

public class Dog extends Animal {
    // constructor to initialize Dog's name and age
    public Dog(String name, int age) {
        super(name, age); // call super class constructor
    }
    // overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name+ " says: Woof Woof!!");
    }
}

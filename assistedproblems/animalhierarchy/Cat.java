package Week_02.Day_05.assistedproblems.animalhierarchy;

public class Cat extends Animal{
    // constructor to initialize Cat's name and age
    public Cat(String name, int age) {
        super(name, age); // call super class constructor
    }
    // overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + ": says Meow Meow!!");
    }
}

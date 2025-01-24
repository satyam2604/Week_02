package Week_02.Day_05.assistedproblems.animalhierarchy;

public class Bird extends Animal {
    // create constructor to initialize Bird's name and age
    public Bird(String name, int age) {
        super(name, age);
    }
    // overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name+ ": says Chirp Chirp!!");
    }
}

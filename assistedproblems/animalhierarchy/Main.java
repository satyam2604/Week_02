package Week_02.Day_05.assistedproblems.animalhierarchy;

public class Main {
    public static void main(String[] args) {
    // create instances of all child class
    Animal dog = new Dog("Dog", 2);
    Animal cat = new Cat("Cat" , 1);
    Animal bird = new Bird("Bird" , 1);

    // display details and sound for each animal
        dog.displayDetails();
        dog.makeSound();
        System.out.println();
        cat.displayDetails();
        cat.makeSound();
        System.out.println();
        cat.displayDetails();
        cat.makeSound();
    }
}

package Week_02.Day_05.assistedproblems.animalhierarchy;

public class Animal {
    // attributes common to all animals
    String name; // name of Animal
    int age; // age of animal
    // constructor to initialize name and age to animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // method to be overridden by child class
    public void makeSound(){
        System.out.println(" Some animal sound!!");
    }
    // method to display animal's details
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
    }
}

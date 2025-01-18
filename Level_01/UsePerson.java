/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.Level_01;

/**
 *
 * @author User
 */
public class UsePerson {

    public static void main(String[] args) {
        System.out.println("Parameterized constructor is called!!!");
        // create object of person class with parameterized constructor
        Person person = new Person("XYZ", 25);
        // call a method to display details
        person.displayDetails();
        // create object of person class with copy constructor
        Person persons = new Person(person);
        // call a method to display details
        persons.displayDetails();
    }
}

class Person {

    // declare variables
    private String name;
    private int age;

    // create a parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // create a copy constructor
    public Person(Person details) {
        this.name = details.name;
        this.age = details.age;
    }

    //method to display details
    public void displayDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}

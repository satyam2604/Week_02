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
public class UseCircle {

    public static void main(String[] args) {
        System.out.println("Default constructor is called!!!");
        // create object of  Circle class with default constructor
        Circle circle = new Circle();
        // display details of circle class
        circle.displayDetails();
        System.out.println("Parameterized constructor is called!!!");
        // create object of Circle class with parameterized constructor
        Circle circles = new Circle(5.2);
        // display details of circle class
        circles.displayDetails();
    }
}

class Circle {

    private double radius;

    // create a default constructor
    public Circle() {
        this(0.5); // constructor chaining
    }

    // create a parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // method to display details
    public void displayDetails() {
        System.out.println("Radius is: " + radius);
    }
}

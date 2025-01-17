/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.AreaOfCircle;

/**
 *
 * @author User
 */
public class Circle {

    // declare field (Attributes) of employee
    private double radius;

    // define constuctor for initializing values
    public Circle(double radius) {
        this.radius = radius;
    }

    // method to find circumference of circle
    public double findCircumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    // method to find area of circle
    public double findAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // method to display area of circle
    public void displayAreaOfCircle() {
        System.out.println("The area of circle for radius: " + radius + " is: " + findAreaOfCircle(radius));
    }

    // method to display circumference of circle
    public void displayCircumferenceOfCircle() {
        System.out.println("The circumference of circle for radius: " + radius + " is: " + findCircumferenceOfCircle(radius));
    }
}

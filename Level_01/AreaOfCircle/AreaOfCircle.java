/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.AreaOfCircle;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        // create scanner object for taking input from user.
        Scanner sc = new Scanner(System.in);
        // take radius of a circle as a input from user
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        // create object of FindAreaOfCircleClass
        Circle fd = new Circle(radius);

        // call a method to find and display area of circle
        fd.displayAreaOfCircle();

        // call a method to display circumference of circle
        fd.displayCircumferenceOfCircle();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_02.StudentReport;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class UseStudent {

    public static void main(String[] args) {
        // create scanner object for user input
        Scanner sc = new Scanner(System.in);

        // take name of student as input from user
        System.out.print("Enter name of student: ");
        String name = sc.nextLine();

        // take roll number of student as input from user
        System.out.print("Enter roll  number of student: ");
        int rollNumber = sc.nextInt();

        // take marks of student as a input from user
        System.out.print("Enter marks of student: ");
        int marks = sc.nextInt();

        // create object of Student class
        Student student = new Student(name, rollNumber, marks);

        // call a method to display student grade and details
        student.displayResults();
    }
}

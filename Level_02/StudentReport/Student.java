/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_02.StudentReport;

/**
 *
 * @author User
 */
public class Student {

    // declare attributres in student class
    private String name;
    private int rollNumber;
    private int marks;

    //  create a constructor to initialize values to it
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // call a method to calculate grade based on price
    public String calculateGrade(int marks) {
        if (marks > 80) {
            return "A";
        } else if (marks > 70 && marks <= 79) {
            return "B";
        } else if (marks > 60 && marks <= 69) {
            return "C";
        } else if (marks > 51 && marks <= 59) {
            return "D";
        } else if (marks > 33 && marks <= 50) {
            return "E";
        }
        return "Fail";
    }

    // call a method display student details and grades
    public void displayResults() {
        System.out.println("Name of student: " + name);
        System.out.println("Roll number of student: " + rollNumber);
        System.out.println("Marks of student: "+ marks);
        System.out.print("Grade of student: " + calculateGrade(marks));
    }
}

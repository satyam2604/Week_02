/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.InstancevsClassVariablesandMethods.OnlineCourseManagement;

/**
 *
 * @author User
 */
public class Course {

    private String courseName; // instance variable
    private int duration; // instance variable
    private double fee; // instance variable
    private static String instituteName; // static/class variable

    // create constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
        instituteName = "TIT Bhopal";
    }
    
    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

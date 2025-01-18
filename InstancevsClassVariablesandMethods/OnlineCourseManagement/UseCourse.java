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
public class UseCourse {

    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("Java Programming", 40, 300);
        Course course2 = new Course("Web Development", 50, 400);

        // Display details of courses
        System.out.println("Before updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Bridge Labz");

        // Display details after updating institute name
        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}

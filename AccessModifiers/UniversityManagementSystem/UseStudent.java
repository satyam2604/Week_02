/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.AccessModifiers.UniversityManagementSystem;

/**
 *
 * @author User
 */
public class UseStudent {

    public static void main(String[] args) {

        // Creating a Student object
        Student student = new Student(101, "Shaun", 8.5);
        student.displayStudentDetails();
        System.out.println();

        // Modifying CGPA using public methods
        student.setCGPA(9.0);
        System.out.println("After updating CGPA:");
        student.displayStudentDetails();
        System.out.println();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Peter", 9.2, "Data Science");
        pgStudent.displayPostgraduateDetails();
    }

}

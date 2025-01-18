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
// Subclass
class PostgraduateStudent extends Student {

    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing protected member `name`
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected field from parent class
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA()); // Accessing private field through public method
    }
}

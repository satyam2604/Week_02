/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.AccessModifiers.EmployeeRecords;

/**
 *
 * @author User
 */
// Subclass
class Manager extends Employee {
    private String teamName; // Manager-specific attribute

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public field
        System.out.println("Department: " + department); // Accessing protected field
        System.out.println("Salary: $" + getSalary()); // Accessing private field through public getter
        System.out.println("Team Name: " + teamName);
    }
}
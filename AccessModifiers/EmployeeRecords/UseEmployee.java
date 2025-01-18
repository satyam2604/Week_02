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
public class UseEmployee {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "Engineering", 60000);
        employee.displayEmployeeDetails();
        System.out.println();

        // Modifying salary using a public method
        employee.setSalary(65000);
        System.out.println("After salary update:");
        employee.displayEmployeeDetails();
        System.out.println();

        // Creating a Manager object
        Manager manager = new Manager(201, "HR", 80000, "Recruitment Team");
        manager.displayManagerDetails();
    }
}

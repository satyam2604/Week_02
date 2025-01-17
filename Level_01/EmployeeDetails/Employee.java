/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.EmployeeDetails;

/**
 *
 * @author User
 */
public class Employee {

    // declares fields(Attributes) of employee
    private String name;
    private int id;
    private double salary;

    // make a constructor to intialize values in it
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee salary: " + salary);
    }
}

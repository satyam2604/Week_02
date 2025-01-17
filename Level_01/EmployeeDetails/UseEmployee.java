/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.EmployeeDetails;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class UseEmployee {

    public static void main(String[] args) {

        // create scanner object for user input
        Scanner sc = new Scanner(System.in);
        // take name of employee as input from user
        System.out.print("Enter name of employee: ");
        String name = sc.nextLine();
        // take id of employee as input from user
        System.out.print("Enter id of employee: ");
        int id = sc.nextInt();
        // take salary of employee as a input from user
        System.out.print("Enter salary of employee: ");
        double salary = sc.nextDouble();

        // create object of employee class
        Employee emp = new Employee(name, id, salary);

        // call a method to diplay employee details
        System.out.println("Employee details");
        emp.displayDetails();
    }
}

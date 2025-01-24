package Week_02.Day_05.assistedproblems.employeemanagement;

public class Employee {
    // Attributes common to all employee
    String name; // name of employee
    int id; // employee id
    double salary; // salary of employee
    // constructor to initialize employee's name, id and salary
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // method to overridden by subclasses
    public void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("Salary: " + salary);
    }
}

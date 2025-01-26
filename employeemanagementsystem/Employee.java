package Week_02.Day_06.employeemanagementsystem;
// Abstract class Employee to represent a generic employee
abstract class Employee {
    // Private fields to restrict direct access (encapsulation)
    private int employeeId;
    private String name;
    private double baseSalary;
    // Constructor to initialize employee details
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    // Getter method for employee ID
    public int getEmployeeId() {
        return employeeId;
    }
    // Setter method for employee ID
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    // Getter method for name
    public String getName() {
        return name;
    }
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter method for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }
    // Setter method for baseSalary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails(){
        System.out.println("Employee ID: "+ employeeId);
        System.out.println("Name: "+ name);
        System.out.println("Base Salary: "+ baseSalary);
    }
}

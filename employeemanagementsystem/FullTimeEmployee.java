package Week_02.Day_06.employeemanagementsystem;
// Subclass FullTimeEmployee extending Employee and implementing Department
public class FullTimeEmployee extends Employee implements Department{
    private double fixedSalary; // Fixed salary for full-time employees
    private String department; // Department assigned to the employee

    // Constructor to initialize full-time employee details
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }
    // Overridden method to calculate salary for full-time employees
    @Override
    public double calculateSalary() {
        return fixedSalary; // Fixed salary for full-time employees
    }

    // Implementation of assignDepartment method
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    // Implementation of getDepartmentDetails method
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

}

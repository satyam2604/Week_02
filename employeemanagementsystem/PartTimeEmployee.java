package Week_02.Day_06.employeemanagementsystem;
// Subclass PartTimeEmployee extending Employee and implementing Department
class PartTimeEmployee extends Employee implements Department {
    private int workHours; // Total work hours of the part-time employee
    private double hourlyRate; // Hourly rate for the employee
    private String department; // Department assigned to the employee

    // Constructor to initialize part-time employee details
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // Overridden method to calculate salary for part-time employees
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate; // Salary based on hours worked
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

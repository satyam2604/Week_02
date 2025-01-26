package Week_02.Day_06.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees (polymorphism with Employee reference)
        Employee[] employees = new Employee[2];

        // Add a full-time employee to the list
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Peter", 50000, 70000);
        fullTimeEmployee.assignDepartment("Finance"); // Assign department
        employees[0] = fullTimeEmployee;

        // Add a part-time employee to the list
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Shaun", 20000, 80, 50);
        partTimeEmployee.assignDepartment("HR"); // Assign department
        employees[1] = partTimeEmployee;

        // Process and display employee details
        for (Employee employee : employees) {
            employee.displayDetails(); // Display general details
            System.out.println("Calculated Salary: " + employee.calculateSalary()); // Display calculated salary

            // Check if employee implements Department interface
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails()); // Display department details
            }

            System.out.println();
        }
    }

}

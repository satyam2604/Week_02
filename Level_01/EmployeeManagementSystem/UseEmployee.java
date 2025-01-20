package Week_02.Day_03.Level_01.EmployeeManagementSystem;

public class UseEmployee {
    public static void main(String[] args) {
        // create object of Employee class
        Employee emp1 = new Employee(101,"Peter", "Engineer");
        Employee emp2 = new Employee(102,"Shaun", "Manager");

        // call methods to display employee details
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();
        // call a static method to get count of total employees
        System.out.println("Total empolyees: "+ Employee.getTotalEmployees());
    }
}

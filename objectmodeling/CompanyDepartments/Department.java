package Week_02.Day_04.objectmodeling.CompanyDepartments;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name; // Department name
    private List<Employee> employees; // list of employees
    // constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    // add employee to the department
    public void addEmployee(Employee emp){
        employees.add(emp);
    }
    // Display department and employee details
    public void display(){
        System.out.println("Department: "+ name);
        for(Employee emp: employees){
            emp.display();
        }
    }
}

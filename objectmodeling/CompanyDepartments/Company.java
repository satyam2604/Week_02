package Week_02.Day_04.objectmodeling.CompanyDepartments;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name; // company name
    private List<Department> departments; // list of departments
    // constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // add departments to the departments
    public void addDepartments(Department  dept) {
        departments.add(dept);
    }

    // display company details
    public void display(){
        System.out.println("Comapany: "+ name);
        for(Department dept: departments){
            dept.display();
        }
    }
}

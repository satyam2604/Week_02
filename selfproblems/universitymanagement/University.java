package Week_02.Day_04.selfproblems.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name; // university name
    private List<Department> departments; // list of department
    // constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>(); // create a new arraylist
    }
    // method to add department in university
    public void addDepartment(String deptName){
        departments.add(new Department(deptName));
    }
    // method to get university details
    public void showDetails(){
        System.out.println("University: "+ name);
        for(Department dept: departments){
            dept.display();
        }
    }
    // Deleting university also deletes its departments
    public void deleteUniversity() {
        departments.clear();  // All departments are deleted
        System.out.println("University " + name + " deleted along with all departments.");
    }
}

package Week_02.Day_04.objectmodeling.CompanyDepartments;

public class Employee {
    private String name; // employee name
    private int id; // employee id
    // constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    // method to display employee details
    public void display(){
        System.out.println("Employee ID: "+ id + " Name: "+ name);
    }
}

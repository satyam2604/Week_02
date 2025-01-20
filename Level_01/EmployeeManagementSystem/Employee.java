package Week_02.Day_03.Level_01.EmployeeManagementSystem;

public class Employee {
    // fields
    private static String companyName = "BridgeLabz"; // static variable
    private static int totalEmployees; // static varible
    private String name; // instance variable
    private final int id; // final variable
    private String designation; // instance variable
    // constructor
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        ++totalEmployees;
    }
    // call a static method to display all employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    // call a method to display all Employee details
    public void displayEmployeeDetails(){
        if(this instanceof Employee){
        System.out.println("Company name: "+ companyName);
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("Designation: "+ designation);
        }else{
            System.out.println("Invalid data!!");
        }
    }
}

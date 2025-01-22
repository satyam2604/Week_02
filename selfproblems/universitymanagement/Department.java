package Week_02.Day_04.selfproblems.universitymanagement;

public class Department {
    private String name; // department name
        // constructor
    public Department(String name) {
        this.name = name;
    }
    // method to display department name
    public void display(){
        System.out.println("Department: " + name);
    }
}

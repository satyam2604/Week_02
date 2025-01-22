package Week_02.Day_04.selfproblems.universitymanagement;

public class Faculty {
    private String facultyName; // faculty name
    // constructor
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }
    // method to display faculty details
    public void display(){
        System.out.println("Faculty: "+ facultyName);
    }
}

package Week_02.Day_03.Level_01.UniversityStudentManagement;

public class Student {
    // fields
    private static String universityName = "RGPV"; // static variable
    private String name; // instance variable
    private final int rollNumber; // final variable
    private String grade; // instance variable
    private static int totalStudents; // static variable
        // Constructor
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        ++totalStudents;
    }
        // static method to find total students
    public static int getTotalStudents() {
        return totalStudents;
    }
    // method to display student details
    public void displayStudentDetails(){
        if(this instanceof  Student){
            System.out.println("University name: "+ universityName);
            System.out.println("Student name: " + name);
            System.out.println("Roll number: "+ rollNumber);
            System.out.println("Grade: "+ grade);
        }else{
            System.out.println("Invalid data!!");
        }
    }
}

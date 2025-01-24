package Week_02.Day_05.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Student extends Person {
    // extend attributes of Person in Student class
    char grade;
    public Student(String name, int age, char grade) {
        super(name, age); // call super class constructor
        this.grade = grade;
    }
    //  override display roles method to extend some features
    @Override
    public void displayRoles() {
        System.out.println("Student: ");
        super.displayRoles();
        System.out.println("Student's Grade: "+ grade);
        System.out.println();
    }
}

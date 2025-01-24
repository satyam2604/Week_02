package Week_02.Day_05.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Main {
    public static void main(String[] args) {
        // create instances of all subclass to achieve Hierarchical Inheritance
        Person teacher = new Teacher("Manohar", 35, "OOPM");
        Person student = new Student("Peter", 20, 'A');
        Person staff = new Staff("Shaun", 36, 15000.0);

        // display roles of each person
        teacher.displayRoles();
        student.displayRoles();
        staff.displayRoles();
    }
}

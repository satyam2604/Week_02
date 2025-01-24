package Week_02.Day_05.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Teacher extends Person{
    // extend attributes of Person in Teacher class
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age); // call super class constructor
        this.subject =subject;
    }
    // override display roles method with extending some extra feature
    @Override
    public void displayRoles() {
        System.out.println("Teacher: ");
        super.displayRoles();
        System.out.println("Teachers teaches: "+ subject);
        System.out.println();
    }
}

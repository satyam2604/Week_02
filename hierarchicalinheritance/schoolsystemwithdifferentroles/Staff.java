package Week_02.Day_05.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Staff extends Person{
    // extend attributes of Person in Staff class
    double salary;
    public Staff(String name, int age, double salary) {
        super(name, age); // call super class constructor
        this.salary = salary;
    }
    // override method to extend some features
    @Override
    public void displayRoles() {
        System.out.println("Staff: ");
        super.displayRoles();
        System.out.println("Salary: "+ salary);
        System.out.println();
    }
}

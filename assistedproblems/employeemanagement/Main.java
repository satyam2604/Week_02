package Week_02.Day_05.assistedproblems.employeemanagement;

public class Main {
    public static void main(String[] args) {
    // create instances of all child classes
        Employee manager = new Manager("Peter", 101, 25000.0, 6);
        Employee developer = new Developer("Shaun", 201,30000.0, "JAVA");
        Employee intern = new Intern("Sonu",301, 15000.0);

        // method to display details of all employees
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}

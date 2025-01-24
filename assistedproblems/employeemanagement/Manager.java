package Week_02.Day_05.assistedproblems.employeemanagement;

public class Manager extends Employee {
    int teamSize; // size of team
    // constructor to initialize manager's attributes
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize= teamSize;
    }
    // override display details method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size of team: " + teamSize);
    }
}

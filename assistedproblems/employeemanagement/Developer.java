package Week_02.Day_05.assistedproblems.employeemanagement;

public class Developer extends Employee{
    String programmingLanguage;
    // constructor to initialize attributes of developer's attributes
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    // override display details method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming language is: "+ programmingLanguage);
    }
}

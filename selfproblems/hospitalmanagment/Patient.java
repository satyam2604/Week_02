package Week_02.Day_04.selfproblems.hospitalmanagment;

// Patient Class
public class Patient {
    private String name; // Patient name

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    // Getter method to get the name of the patient
    public String getName() {
        return name;
    }

    // Method to display the name of the patient
    public void display() {
        System.out.println("Patient: " + name);
    }
}

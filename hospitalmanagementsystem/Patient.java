package Week_02.Day_06.hospitalmanagementsystem;
// Abstract class Patient to represent a generic patient
abstract class Patient {
    // Private fields for patient details (encapsulation)
    private String patientId;
    private String name;
    private int age;

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter method for patientId
    public String getPatientId() {
        return patientId;
    }

    // Setter method for patientId
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method to calculate bill (to be implemented by subclasses)
    public abstract double calculateBill();
}
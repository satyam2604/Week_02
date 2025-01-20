package Week_02.Day_03.Level_01.HospitalManagementSystem;

public class Patient {
    // fields
    private static String hospitalName = "Arogya Hospital"; // static variable
    private String name; // instance variable
    private int age; // instance variable
    private String ailment; // instance variable
    private final int patientID; // final variable
    private static int totalPatients;
    // constructor
    public Patient(int patientID, String ailment, int age, String name) {
        this.patientID = patientID;
        this.ailment = ailment;
        this.age = age;
        this.name = name;
        totalPatients++;
    }
    // staic method to find total patients
    public static int getTotalPatients() {
        return totalPatients;
    }
    // method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient name: " + name);
            System.out.println("Patient age: " + age);
            System.out.println("Aliment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital name: " + hospitalName);
        }else{
            System.out.println("Invalid data!!!");
        }
    }
}

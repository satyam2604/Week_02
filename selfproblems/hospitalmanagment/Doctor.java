package Week_02.Day_04.selfproblems.hospitalmanagment;

import java.util.ArrayList;
import java.util.List;

// Doctor Class
public class Doctor {
    private String name; // Doctor name
    private List<Patient> patients; // List of patients

    // Constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>(); // Initialize the list of patients
    }

    // Method to add a patient to the doctor's list
    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
    }

    // Method to display details of the doctor and their patients
    public void display() {
        System.out.println("Doctor: " + name);
        System.out.println("Patients under care:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName());
        }
    }
}

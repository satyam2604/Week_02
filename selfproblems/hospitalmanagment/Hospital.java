package Week_02.Day_04.selfproblems.hospitalmanagment;

import java.util.ArrayList;
import java.util.List;

// Hospital Class
public class Hospital {
    private String name; // Hospital name
    private List<Doctor> doctors; // List of doctors
    private List<Patient> patients; // List of patients

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add doctors to the hospital
    public void addDoctor(String doctorName) {
        doctors.add(new Doctor(doctorName));
    }

    // Method to add patients to the hospital
    public void addPatient(String patientName) {
        patients.add(new Patient(patientName));
    }

    // Method to show hospital details
    public void showDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors and their patients:");
        for (Doctor doctor : doctors) {
            doctor.display();
        }
    }

    // Method to return the list of doctors
    public List<Doctor> getDoctors() {
        return doctors;
    }

    // Method to return the list of patients
    public List<Patient> getPatients() {
        return patients;
    }
}

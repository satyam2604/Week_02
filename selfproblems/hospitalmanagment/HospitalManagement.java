package Week_02.Day_04.selfproblems.hospitalmanagment;

public class HospitalManagement {
    public static void main(String[] args) {
        // Create an instance of the hospital class
        Hospital hospital = new Hospital("Arogya");

        // Add doctors and patients
        hospital.addDoctor("Peter");
        hospital.addDoctor("Shaun");
        hospital.addPatient("Chris");
        hospital.addPatient("Robert");

        // Association between doctors and patients
        Doctor doctor1 = hospital.getDoctors().get(0);
        Doctor doctor2 = hospital.getDoctors().get(1);
        Patient patient1 = hospital.getPatients().get(0);
        Patient patient2 = hospital.getPatients().get(1);

        // Consulting patients
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Show hospital details
        hospital.showDetails();
    }
}

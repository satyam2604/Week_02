package Week_02.Day_06.hospitalmanagementsystem;

public class Main {
    // Method to process and display patient details
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: $" + patient.calculateBill());

        // Check if the patient has medical records
        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            System.out.println(record.viewRecords());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of patients (polymorphism with Patient reference)
        Patient[] patients = new Patient[2];

        // Add an in-patient to the array
        InPatient inPatient = new InPatient("P001", "Alice", 30, 200.0, 5);
        inPatient.addRecord("Diagnosed with flu.");
        inPatient.addRecord("Prescribed bed rest and medication.");
        patients[0] = inPatient;

        // Add an out-patient to the array
        OutPatient outPatient = new OutPatient("P002", "Bob", 25, 50.0);
        outPatient.addRecord("Diagnosed with seasonal allergy.");
        patients[1] = outPatient;

        // Process and display details for all patients
        for (Patient patient : patients) {
            processPatient(patient);
        }
    }
}

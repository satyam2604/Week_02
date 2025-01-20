package Week_02.Day_03.Level_01.HospitalManagementSystem;

public class UsePatient {
    public static void main(String[] args) {
        // create instance of Patient class
        Patient patient1 = new Patient(101,"Fever",25,"Peter");
        Patient patient2 = new Patient(102,"Cough", 29, "Shaun");
        // call a method to display patient details
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();
        System.out.println();
        // call method to display total patients
        System.out.println("Total patients: "+ Patient.getTotalPatients());
    }
}

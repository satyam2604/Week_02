package Week_02.Day_06.hospitalmanagementsystem;

// Subclass InPatient extending Patient and implementing MedicalRecord
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate; // Daily hospital stay rate
    private int daysAdmitted; // Number of days admitted
    private String medicalHistory; // Encapsulated medical history

    // Constructor to initialize in-patient details
    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "";
    }

    // Overridden method to calculate bill for in-patients
    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    // Implementation of addRecord method
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    // Implementation of viewRecords method
    @Override
    public String viewRecords() {
        return "Medical History:\n" + medicalHistory;
    }
}

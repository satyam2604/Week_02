package Week_02.Day_06.hospitalmanagementsystem;

// Subclass OutPatient extending Patient and implementing MedicalRecord
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee; // Fee for consultation
    private String medicalHistory; // Encapsulated medical history

    // Constructor to initialize out-patient details
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    // Overridden method to calculate bill for out-patients
    @Override
    public double calculateBill() {
        return consultationFee;
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

package Week_02.Day_06.vehiclerentalsystem;

// Subclass Bike extending Vehicle and implementing Insurable
class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.01; // Insurance rate for bikes
    private String insurancePolicyNumber; // Encapsulated insurance policy number

    // Constructor to initialize bike details
    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Overridden method to calculate rental cost for bikes
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implementation of calculateInsurance method
    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    // Implementation of getInsuranceDetails method
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

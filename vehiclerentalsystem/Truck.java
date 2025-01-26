package Week_02.Day_06.vehiclerentalsystem;

// Subclass Truck extending Vehicle and implementing Insurable
class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.03; // Insurance rate for trucks
    private String insurancePolicyNumber; // Encapsulated insurance policy number

    // Constructor to initialize truck details
    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Overridden method to calculate rental cost for trucks
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
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

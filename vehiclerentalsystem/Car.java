package Week_02.Day_06.vehiclerentalsystem;

// Subclass Car extending Vehicle and implementing Insurable
class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.02; // Insurance rate for cars
    private String insurancePolicyNumber; // Encapsulated insurance policy number

    // Constructor to initialize car details
    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Overridden method to calculate rental cost for cars
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
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}
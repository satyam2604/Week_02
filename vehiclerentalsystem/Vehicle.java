package Week_02.Day_06.vehiclerentalsystem;
// Abstract class Vehicle to represent a generic vehicle
abstract class Vehicle {
    // Private fields for vehicle details (encapsulation)
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter method for vehicleNumber
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Setter method for vehicleNumber
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    // Getter method for type
    public String getType() {
        return type;
    }

    // Setter method for type
    public void setType(String type) {
        this.type = type;
    }

    // Getter method for rentalRate
    public double getRentalRate() {
        return rentalRate;
    }

    // Setter method for rentalRate
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost (to be implemented by subclasses)
    public abstract double calculateRentalCost(int days);
}

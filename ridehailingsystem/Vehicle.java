package Week_02.Day_06.ridehailingsystem;
// Abstract class Vehicle to represent a generic vehicle
abstract class Vehicle {
    // Private fields for vehicle details (encapsulation)
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getter method for vehicleId
    public String getVehicleId() {
        return vehicleId;
    }

    // Setter method for vehicleId
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    // Getter method for driverName
    public String getDriverName() {
        return driverName;
    }

    // Setter method for driverName
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Getter method for ratePerKm
    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setter method for ratePerKm
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Abstract method to calculate fare (to be implemented by subclasses)
    public abstract double calculateFare(double distance);
}
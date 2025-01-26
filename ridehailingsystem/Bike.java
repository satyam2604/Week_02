package Week_02.Day_06.ridehailingsystem;

// Subclass Bike extending Vehicle and implementing GPS
class Bike extends Vehicle implements GPS {
    private String currentLocation; // Encapsulated current location

    // Constructor to initialize bike details
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overridden method to calculate fare for bikes
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // Discounted rate for bikes
    }

    // Implementation of getCurrentLocation method
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implementation of updateLocation method
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
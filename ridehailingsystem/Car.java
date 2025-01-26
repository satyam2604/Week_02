package Week_02.Day_06.ridehailingsystem;

// Subclass Car extending Vehicle and implementing GPS
class Car extends Vehicle implements GPS {
    private String currentLocation; // Encapsulated current location

    // Constructor to initialize car details
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overridden method to calculate fare for cars
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
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
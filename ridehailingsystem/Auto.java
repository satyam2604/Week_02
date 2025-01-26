package Week_02.Day_06.ridehailingsystem;

// Subclass Auto extending Vehicle and implementing GPS
class Auto extends Vehicle implements GPS {
    private String currentLocation; // Encapsulated current location

    // Constructor to initialize auto details
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Overridden method to calculate fare for autos
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.1; // Additional charge for autos
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

package Week_02.Day_06.ridehailingsystem;

// Interface GPS to represent GPS functionality
interface GPS {
    // Method to get the current location
    String getCurrentLocation();

    // Method to update the location
    void updateLocation(String newLocation);
}
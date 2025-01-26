package Week_02.Day_06.ridehailingsystem;

public class Main {
    // Method to process and display vehicle details
    public static void processVehicle(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));

        // Check if the vehicle has GPS functionality
        if (vehicle instanceof GPS) {
            GPS gps = (GPS) vehicle;
            System.out.println("Current Location: " + gps.getCurrentLocation());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of vehicles (polymorphism with Vehicle reference)
        Vehicle[] vehicles = new Vehicle[3];

        // Add a car to the array
        vehicles[0] = new Car("V001", "Alice", 2.0, "Downtown");

        // Add a bike to the array
        vehicles[1] = new Bike("V002", "Bob", 1.0, "Uptown");

        // Add an auto to the array
        vehicles[2] = new Auto("V003", "Charlie", 1.5, "Suburb");

        // Process and display details for all vehicles
        for (Vehicle vehicle : vehicles) {
            processVehicle(vehicle, 10); // Calculate fare for 10 km
        }
    }
}

package Week_02.Day_06.vehiclerentalsystem;

public class Main {
    // Method to calculate and display rental and insurance costs for a vehicle
    public static void processVehicle(Vehicle vehicle) {
        int rentalDays = 5; // Example rental period
        double rentalCost = vehicle.calculateRentalCost(rentalDays); // Calculate rental cost

        // Display vehicle details and rental cost
        System.out.println("Vehicle: " + vehicle.getType());
        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

        // Check if the vehicle is insurable
        if (vehicle instanceof Insurable) {
            double insuranceCost = ((Insurable) vehicle).calculateInsurance();
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of vehicles (polymorphism with Vehicle reference)
        Vehicle[] vehicles = new Vehicle[3];

        // Add a car to the array
        vehicles[0] = new Car("C123", "Car", 1000, "CAR-INS-001");

        // Add a bike to the array
        vehicles[1] = new Bike("B456", "Bike", 500, "BIKE-INS-002");

        // Add a truck to the array
        vehicles[2] = new Truck("T789", "Truck", 2000, "TRUCK-INS-003");

        // Process and display details for all vehicles
        for (Vehicle vehicle : vehicles) {
            processVehicle(vehicle);
        }
    }
}

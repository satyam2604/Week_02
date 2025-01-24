package Week_02.Day_05.assistedproblems.vehicleandtransport;

public class Vehicle {
    // Attributes common to all Vehicle Class
    int maxSpeed; // max speed of vehicle
    String fuelType; // fuel type of vehicle
    // constructor to initialize attributes of Vehicle class
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    // method to display information of Vehicle
    public void displayInfo(){
        System.out.println("Max Speed: "+ maxSpeed);
        System.out.println("Fuel Type: "+ fuelType);
    }
}

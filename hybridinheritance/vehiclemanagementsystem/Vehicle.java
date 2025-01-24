package Week_02.Day_05.hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
    // attributes of vehicle class which is common for all subclass
    int maxSpeed;
    String model;
    // constructor to initialize values to attributes of vehicle
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

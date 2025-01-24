package Week_02.Day_05.assistedproblems.vehicleandtransport;

public class Truck extends Vehicle{
    // constructor to initialize vehicle attributes
    public Truck(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }
    // override display info method
    @Override
    public void displayInfo() {
        System.out.println("Information about TRUCK");
        super.displayInfo();
    }
}

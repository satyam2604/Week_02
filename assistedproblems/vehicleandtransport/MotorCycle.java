package Week_02.Day_05.assistedproblems.vehicleandtransport;

public class MotorCycle extends Vehicle {
    // constructor to initialize motorcycle attributes
    public MotorCycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }
    // override displayinfo method
    @Override
    public void displayInfo() {
        System.out.println("Information about MOTORCYCLE");
        super.displayInfo();
    }
}

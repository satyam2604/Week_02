package Week_02.Day_05.assistedproblems.vehicleandtransport;

public class Car extends Vehicle {
    int seatCapacity;
    // constructor to initialize car's attributes
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    // override display info method
    @Override
    public void displayInfo() {
        System.out.println("Information about CAR");
        super.displayInfo();
        System.out.println("Seat capacity: "+ seatCapacity);
    }
}

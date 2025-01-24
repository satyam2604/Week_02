package Week_02.Day_05.assistedproblems.vehicleandtransport;

public class Main {
    public static void main(String[] args) {
    // create instances of all subclass
        Vehicle car = new Car(120,"Petrol", 5);
        Vehicle truck = new Truck(100,"Diesel");
        Vehicle motorCycle = new MotorCycle(100, "Petrol");

        // display information about all classes
        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();
        motorCycle.displayInfo();
    }
}

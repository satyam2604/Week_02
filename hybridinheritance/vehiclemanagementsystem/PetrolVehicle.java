package Week_02.Day_05.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable{
    // extend features in petrol vehicle
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    // override refuel methode from refuelable interface to extend its features
    @Override
    public void refuel() {
        System.out.println("Max Speed:" + maxSpeed);
        System.out.println("Model: "+ model);
        System.out.println("Vehicle is refueled!!!!");
        System.out.println();
    }
}

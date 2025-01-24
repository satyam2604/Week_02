package Week_02.Day_05.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle{
    // extend features of Vehicle class
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // method to charge electric vehicle
    public void charge(){
        System.out.println("Max Speed: "+ maxSpeed);
        System.out.println("Model: "+ model);
        System.out.println("Vehicle is recharging!!!");
        System.out.println();
    }
}

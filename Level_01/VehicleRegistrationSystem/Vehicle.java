package Week_02.Day_03.Level_01.VehicleRegistrationSystem;

public class Vehicle {
    // fields
    private static double registrationFee = 500; // static variable
    private String ownerName; // instance variable
    private String vehicleType; // instance variable
    private final int registationNumber; // final variable
    // constructor
    public Vehicle(int registationNumber, String vehicleType, String ownerName) {
        this.registationNumber = registationNumber;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }
    // method to update registration fee
    public static void updateRegistrationFee(double newRegistrationFee){
        registrationFee= newRegistrationFee;
    }
    // method to display registration fee
    public static double getRegistrationFee() {
        return registrationFee;
    }
    // method to display vehicle details
    public void displayVehicleDetails(){
        if(this instanceof Vehicle){
            System.out.println("Owner name: "+ ownerName);
            System.out.println("Vehicle type: " + vehicleType);
            System.out.println("Registration Number:" + registationNumber);
        }else{
            System.out.println("Invalid data!!");
        }
    }
}

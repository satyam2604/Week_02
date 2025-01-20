package Week_02.Day_03.Level_01.VehicleRegistrationSystem;

public class UseVehicle {
    public static void main(String[] args) {
    // create instance of Vehicle class
        Vehicle vehicle1 = new Vehicle(101, "Two wheeler", "Peter");
        Vehicle vehicle2 = new Vehicle(102, "Four wheeler", "Shaun");
        // call method to display vehicle details
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        // call method to display registration fee
        System.out.println("Registration fee: "+ Vehicle.getRegistrationFee());
        // call a method to update registration fee
        Vehicle.updateRegistrationFee(750.0);
        // call a method to display updated registration fee
        System.out.println("Updated registration fee: "+ Vehicle.getRegistrationFee());
    }
}

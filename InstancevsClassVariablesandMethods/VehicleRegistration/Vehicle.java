/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.InstancevsClassVariablesandMethods.VehicleRegistration;

/**
 *
 * @author User
 */
public class Vehicle {

    private String ownerName; // instance variable
    private String vehicleType; // instance variable
    private static double registrationFee; // class variable

    // create a constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFee = 500.0;
    }

    //an instance method to display owner and vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("Registration fee: " + registrationFee);
    }

    // a class method to update registration fees
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
}

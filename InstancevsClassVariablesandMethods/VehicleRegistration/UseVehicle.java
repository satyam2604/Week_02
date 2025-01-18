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
public class UseVehicle {

    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Shaun", "Swift");
        Vehicle vehicle2 = new Vehicle("Peter", "Baleno");

        // Display details before updating registration fee
        System.out.println("Details before updating registration fee!!!");
        System.out.println();
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        // update registration fee
        Vehicle.updateRegistrationFee(700.0);

        // Display details after updating registration fee
        System.out.println();
        System.out.println("Details after updating registration fee!!!");
        System.out.println();
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}

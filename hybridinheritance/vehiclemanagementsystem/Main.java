package Week_02.Day_05.hybridinheritance.vehiclemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // create instances of vehicle and refuelable with the help of electric vehicle and petrol vehicle
        ElectricVehicle ev = new ElectricVehicle(45, "EV");
        PetrolVehicle pv = new PetrolVehicle(140, "Swift");

        // display method to refuel petrol vehicle
        pv.refuel();

        // display method to charge ev vehicle
        ev.charge();
    }
}

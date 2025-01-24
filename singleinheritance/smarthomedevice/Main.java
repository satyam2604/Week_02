package Week_02.Day_05.singleinheritance.smarthomedevice;

public class Main {
    public static void main(String[] args) {
    // create instance of thermostat class extending features of Device class
    Device thermo = new Thermostat(101, "ON", "turn off");
    // display status of device
        thermo.displayStatus();
    }
}

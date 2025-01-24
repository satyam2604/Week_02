package Week_02.Day_05.singleinheritance.smarthomedevice;

public class Thermostat extends Device {
    // extend attributes of device class in thermostat class
    String temperatureSetting;
    public Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    // override display status methods
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature setting: " + temperatureSetting);
    }
}

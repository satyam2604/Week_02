package Week_02.Day_05.singleinheritance.smarthomedevice;

public class Device {
    // attributes of Device class
    int deviceId; // id of device
    String status; // status of device
    // constructor to initialize attributes of Device class
    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    // method to display status of device
    public void displayStatus(){
        System.out.println("Device ID: "+ deviceId);
        System.out.println("Device Status: "+ status);
    }
}

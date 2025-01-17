/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.HandleMobilePhoneDetails;

/**
 *
 * @author User
 */
public class MobilePhone {
    // declare attributes of Mobile Phone   
    private String brand;
    private String model;
    private double price;

    // create a constructor to initialize values to it
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // call a method to display mobile phone details
    public void displayMobilePhoneDetails() {
        System.out.println("The Brand of mobile is: " + brand);
        System.out.println("The Model of mobile is: " + model);
        System.out.println("The price of mobile is: " + price);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.HandleMobilePhoneDetails;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class UseMobilePhone {
    public static void main(String[] args) {
        // create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // take brand of mobile as input from user
        System.out.print("Enter Brand of mobile: ");
        String brand = sc.nextLine();
        
        // take model of mobile as input from user
        System.out.print("Enter model of mobile: ");
        String model = sc.nextLine();
        
        // take price of mobile as a input from user
        System.out.print("Enter price of mobile: ");
        double price = sc.nextDouble();

        // create object of mobile phone class
        MobilePhone mp = new MobilePhone(brand, model, price);

        // call a method to diplay mobile phone details
        mp.displayMobilePhoneDetails();
    }
}

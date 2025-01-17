/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.InventoryOfItems;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class UseItem {

    public static void main(String[] args) {
        // create scanner object for user input
        Scanner sc = new Scanner(System.in);
        // take name of item as input from user
        System.out.print("Enter name of the item: ");
        String itemName = sc.nextLine();
        // take code of the item as input from user
        System.out.print("Enter code of the item: ");
        int itemCode = sc.nextInt();
        // take price of item as a input from user
        System.out.print("Enter price of item: ");
        double price = sc.nextDouble();

        // create object of item class
        Item it = new Item(itemCode, itemName, price);

        // call a method to display item details
        it.displayDetails();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.InventoryOfItems;

/**
 *
 * @author User
 */
public class Item {

    // declare attributes of item
    private int itemCode;
    private String itemName;
    private double price;
    private int quantity = 10;

    // define constructor to intialize values to it
    public Item(int itemCode, String itemName, double price) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
    }

    // call a method to find total cost for given quantity
    public double calculateTotalCost(double price, int quantity) {
        return price * quantity;
    }

    // call a method to display item details
    public void displayDetails() {
        System.out.println("Name of the item: " + itemName);
        System.out.println("Code of the item: " + itemCode);
        System.out.println("Price of the item: " + price);
        System.out.println("Total cost of item for quantity " + quantity + " is: " + calculateTotalCost(price, quantity));
    }
}

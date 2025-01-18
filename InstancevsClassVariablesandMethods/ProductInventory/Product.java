/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.InstancevsClassVariablesandMethods.ProductInventory;

/**
 *
 * @author User
 */
public class Product {

    private String productName; // instance variable
    private double price; // instance variable
    private static int totalProducts; // static/class variable
    // create constructor

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }
    // create an instance method to display product details

    public void displayProductDetails() {
        System.out.println("Product name: " + productName);
        System.out.println("Price: " + price);
    }

    // create an class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total products are: " + totalProducts);
    }
}

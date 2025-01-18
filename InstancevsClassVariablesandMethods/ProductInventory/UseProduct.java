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
public class UseProduct {

    public static void main(String[] args) {
        // create product instances
        Product product1 = new Product("Chair", 250);
        Product product2 = new Product("Table", 500);
        Product product3 = new Product("Pen", 10);

        // display product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // display total products
        Product.displayTotalProducts();
    }
}

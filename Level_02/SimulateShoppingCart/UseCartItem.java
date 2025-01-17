/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_02.SimulateShoppingCart;

import Week_02.Day_01.Level_02.SimulateShoppingCart.CartItem.ShoppingCart;

/**
 *
 * @author User
 */
public class UseCartItem {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Laptop", 999.99, 1);
        cart.addItem("Mouse", 25.50, 2);
        cart.addItem("Keyboard", 45.00, 1);

        // Display cart items
        cart.displayCartItems();

        // Display total cost
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem("Mouse");

        // Display cart items after removal
        cart.displayCartItems();

        // Display total cost after removal
        cart.displayTotalCost();
    }
}

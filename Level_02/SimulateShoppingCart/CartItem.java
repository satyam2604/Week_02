/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_02.SimulateShoppingCart;

/**
 *
 * @author User
 */
public class CartItem {
    // declare attributes in cart item class
    private String itemName;
    private double price;
    private int quantity;

    // create a constructor to initialize values to it
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for getting values from them
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // ShoppingCart class 
    public static class ShoppingCart {

        private CartItem[] cartItems;
        private int itemCount;

        // Constructor
        public ShoppingCart() {
            this.cartItems = new CartItem[10]; // Fixed-size array for simplicity
            this.itemCount = 0;
        }

        // Method to add an item to the cart
        public void addItem(String itemName, double price, int quantity) {
            if (itemCount < cartItems.length) {
                cartItems[itemCount] = new CartItem(itemName, price, quantity);
                itemCount++;
                System.out.println("Item added to cart: " + itemName);
            } else {
                System.out.println("Cart is full. Cannot add more items.");
            }
        }

        // Method to remove an item from the cart
        public void removeItem(String itemName) {
            boolean itemRemoved = false;
            for (int i = 0; i < itemCount; i++) {
                if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                    for (int j = i; j < itemCount - 1; j++) {
                        cartItems[j] = cartItems[j + 1];
                    }
                    cartItems[itemCount - 1] = null;
                    itemCount--;
                    System.out.println("Item removed from cart: " + itemName);
                    itemRemoved = true;
                    break;
                }
            }
            if (!itemRemoved) {
                System.out.println("Item not found in the cart: " + itemName);
            }
        }

        // Method to display the total cost
        public void displayTotalCost() {
            double totalCost = 0;
            for (int i = 0; i < itemCount; i++) {
                totalCost += cartItems[i].getPrice() * cartItems[i].getQuantity();
            }
            System.out.println("Total Cost: $" + totalCost);
        }

        // Method to display all items in the cart
        public void displayCartItems() {
            if (itemCount == 0) {
                System.out.println("The cart is empty.");
            } else {
                System.out.println("Cart Items:");
                for (int i = 0; i < itemCount; i++) {
                    System.out.println("- " + cartItems[i].getItemName() + " | Price: $" + cartItems[i].getPrice() + " | Quantity: " + cartItems[i].getQuantity());
                }
            }
        }
    }
}

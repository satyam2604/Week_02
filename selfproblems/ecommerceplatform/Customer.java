package Week_02.Day_04.selfproblems.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;  // Customer ID
    private String name;  // Customer name
    private List<Order> orders;  // List of customer's orders

    // Constructor to initialize Customer
    public Customer(int customerId, String name) {
        this.customerId = customerId;  // Assigning customer ID
        this.name = name;  // Assigning customer name
        this.orders = new ArrayList<>();  // Initializing order list
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);  // Adding order to the list
    }

    // Method to get order history
    public List<Order> getOrderHistory() {
        return orders;  // Returning list of orders
    }

    // Method to get customer details as string
    @Override
    public String toString() {
        return "Customer: " + name + " (ID: " + customerId + ")";  // Returning formatted string
    }
    // mthod to return customer name
    public String getName() {
        return name;
    }
}

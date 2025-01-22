package Week_02.Day_04.selfproblems.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId; // order id
    private Customer customer; // Customer who placed order
    private List<Product> products; // list of products in order
    // constructor
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    // method to add product to order
    public void addProduct(Product product){
        products.add(product);
    }
    // method to calculate total price of product
    public double getTotalPrice(){
        double total =0;
        for(Product product : products){
            total+= product.getPrice();
        }
        return total;
    }
    // Method to get order details as string
    @Override
    public String toString() {
        StringBuilder productList = new StringBuilder();  // StringBuilder for product details
        for (Product product : products) {  // Iterating through product list
            productList.append(product.toString()).append("\n");  // Appending product details
        }
        return "Order ID: " + orderId + "\nCustomer: " + customer.getName() + "\nProducts:\n" + productList + "Total: $" + getTotalPrice();  // Returning formatted string
    }

}

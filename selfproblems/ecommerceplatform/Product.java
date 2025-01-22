package Week_02.Day_04.selfproblems.ecommerceplatform;

public class Product {
    private String productName; // name of product
    private int id; // name of product
    private double price; // price of product
    // constructor
    public Product(int id, String productName, double price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }
    // method to get product details as String
    @Override
    public String toString() {
        return productName + " (ID: " + id + ") - $" + price;  // Returning formatted string
    }
    // method to return price of product
    public double getPrice() {
        return price;
    }
}

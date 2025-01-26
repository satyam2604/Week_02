package Week_02.Day_06.ecommerceplatform;
abstract class Product {
    // Private fields to restrict direct access (encapsulation)
    private int productId;
    private String name;
    private double price;
    // constructor to initialize product details
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    // Getter method for product ID
    public int getProductId() {
        return productId;
    }
    // Setter method for product ID
    public void setProductId(int productId) {
        this.productId = productId;
    }
    // Getter method for name
    public String getName() {
        return name;
    }
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter method for price
    public double getPrice() {
        return price;
    }
    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }
    // abstract method to calculate discount
    public abstract double calculateDiscount();
}

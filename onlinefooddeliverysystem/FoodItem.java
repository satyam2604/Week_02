package Week_02.Day_06.onlinefooddeliverysystem;
// Abstract class FoodItem to represent a generic food item
abstract class FoodItem {
    // Private fields for food item details (encapsulation)
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter method for itemName
    public String getItemName() {
        return itemName;
    }

    // Setter method for itemName
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Concrete method to get food item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity;
    }

    // Abstract method to calculate total price (to be implemented by subclasses)
    public abstract double calculateTotalPrice();
}
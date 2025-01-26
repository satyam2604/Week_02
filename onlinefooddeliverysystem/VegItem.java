package Week_02.Day_06.onlinefooddeliverysystem;

// Subclass VegItem extending FoodItem and implementing Discountable
class VegItem extends FoodItem implements Discountable {
    private double discountApplied; // Discount applied to the item

    // Constructor to initialize veg item details
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0;
    }

    // Overridden method to calculate total price for veg items
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Implementation of applyDiscount method
    @Override
    public void applyDiscount(double discountRate) {
        discountApplied = calculateTotalPrice() * discountRate / 100;
    }

    // Implementation of getDiscountDetails method
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: $" + discountApplied;
    }
}
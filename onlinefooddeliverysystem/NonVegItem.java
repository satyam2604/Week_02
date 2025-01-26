package Week_02.Day_06.onlinefooddeliverysystem;

// Subclass NonVegItem extending FoodItem and implementing Discountable
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_ADDITIONAL_CHARGE = 2.0; // Additional charge for non-veg items
    private double discountApplied; // Discount applied to the item

    // Constructor to initialize non-veg item details
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0;
    }

    // Overridden method to calculate total price for non-veg items
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_ADDITIONAL_CHARGE) * getQuantity();
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
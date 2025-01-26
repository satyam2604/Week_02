package Week_02.Day_06.ecommerceplatform;

// Subclass Clothing extending Product and implementing Taxable
class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05; // Tax rate for clothing

    // Constructor to initialize clothing product details
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Overridden method to calculate discount for clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    // Implementation of calculateTax method
    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    // Implementation of getTaxDetails method
    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}
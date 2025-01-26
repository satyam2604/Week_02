package Week_02.Day_06.ecommerceplatform;
// Subclass Electronics extending Product and implementing Taxable
public class Electronics extends Product implements Taxable{
    private static final double TAX_RATE = 0.18; // Tax rate for electronics

    // Constructor to initialize electronics product details
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Overridden method to calculate discount for electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    // Implementation of calculateTax method
    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    // Implementation of getTaxDetails method
    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}

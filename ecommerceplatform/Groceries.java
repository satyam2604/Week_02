package Week_02.Day_06.ecommerceplatform;

// Subclass Groceries extending Product without implementing Taxable (no tax on groceries)
class Groceries extends Product {
    // Constructor to initialize grocery product details
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Overridden method to calculate discount for groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
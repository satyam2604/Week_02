package Week_02.Day_06.ecommerceplatform;

public class Main {
    // Method to calculate and display the final price of a product
    public static void calculateFinalPrice(Product product) {
        double basePrice = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        // Check if the product is taxable
        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double finalPrice = basePrice + tax - discount; // Calculate final price

        // Display product details and final price
        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: " + basePrice);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);

        // If product is taxable, display tax details
        if (product instanceof Taxable) {
            System.out.println(((Taxable) product).getTaxDetails());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of products (polymorphism with Product reference)
        Product[] products = new Product[3];

        // Add an electronics product to the array
        products[0] = new Electronics(101, "Smartphone", 50000);

        // Add a clothing product to the array
        products[1] = new Clothing(102, "Jacket", 2000);

        // Add a grocery product to the array
        products[2] = new Groceries(103, "Rice", 1000);

        // Process and display final prices for all products
        for (Product product : products) {
            calculateFinalPrice(product);
        }
    }

}

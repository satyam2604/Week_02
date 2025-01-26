package Week_02.Day_06.onlinefooddeliverysystem;

public class Main {
    // Method to process and display food item details
    public static void processFoodItem(FoodItem item, double discountRate) {
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: $" + item.calculateTotalPrice());

        // Check if the item is discountable
        if (item instanceof Discountable) {
            Discountable discountable = (Discountable) item;
            discountable.applyDiscount(discountRate);
            System.out.println(discountable.getDiscountDetails());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of food items (polymorphism with FoodItem reference)
        FoodItem[] items = new FoodItem[2];

        // Add a veg item to the array
        items[0] = new VegItem("Paneer Tikka", 10.0, 3);

        // Add a non-veg item to the array
        items[1] = new NonVegItem("Chicken Curry", 15.0, 2);

        // Process and display details for all food items
        double discountRate = 10.0; // Discount rate in percentage
        for (FoodItem item : items) {
            processFoodItem(item, discountRate);
        }
    }
}

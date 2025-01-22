package Week_02.Day_04.umldiagrams.grocerystoreapplication;

public class Product {
    private String name; // name of the product
    private double pricePerUnit; // unit price of product
    private double quantity; // quantity of product
    // constructor
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }
    // method to calculate total price of product
    public double  calculateTotalPrice(){
        return pricePerUnit*quantity;
    }
    // Getter method to get name of product
    public String getName() {
        return name;
    }
    // Getter method to get price of product
    public double getPricePerUnit() {
        return pricePerUnit;
    }
    // Getter method to get quantity of product
    public double getQuantity() {
        return quantity;
    }
}

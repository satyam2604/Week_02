package Week_02.Day_03.Level_01.ShoppingCartSystem;

public class Product {
    // fields
    private static double discount = 7.5; // static variable
    private String productName; // instance variable
    private double price; // instance variable
    private int quantity; // instance variable
    private final int ID; // final variable
    // constructor
    public Product(int ID, int quantity, double price, String productName) {
        this.ID = ID;
        this.quantity = quantity;
        this.price = price;
        this.productName = productName;
    }
    // create a static method to update discount
    public static void updateDiscount(double newDiscount){
        discount = newDiscount;
    }

    // create a static method to get update discount
    public static double getDiscount() {
        return discount;
    }

    // create a method to display account details
    public void displayProductDetails() {
        if (this instanceof Product) { //  check instance of product
            System.out.println("Product Name: " + productName);
            System.out.println("Product price: " + price);
            System.out.println("Product Quantity: " + quantity);
            System.out.println("Product Id: " + ID);
        }else{
            System.out.println("invalid product!!");
        }
    }
}

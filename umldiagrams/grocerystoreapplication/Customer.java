package Week_02.Day_04.umldiagrams.grocerystoreapplication;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name; // customer name
    private List<Product> products; // list of products
    // constructor
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }
    // method to add product in list
    public void addProduct(Product product){
        products.add(product);
    }
    // Getter method to get name of customer
    public String getName() {
        return name;
    }
    // Getter method to get list of products
    public List<Product> getProducts() {
        return products;
    }
}

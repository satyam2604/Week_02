package Week_02.Day_04.selfproblems.ecommerceplatform;

public class EcommerceSystem {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product(1, "Laptop", 1200);
        Product product2 = new Product(2, "Phone", 800);

        // Creating a customer
        Customer customer = new Customer(101, "Peter");

        // Creating an order
        Order order1 = new Order(5001, customer);
        order1.addProduct(product1);  // Adding product1 to the order
        order1.addProduct(product2);  // Adding product2 to the order

        // Customer places the order
        customer.placeOrder(order1);

        // Printing order details
        System.out.println(order1);

        // Printing customer order history
        for (Order order : customer.getOrderHistory()) {
            System.out.println(order);
        }
    }
}

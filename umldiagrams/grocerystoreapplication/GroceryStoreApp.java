package Week_02.Day_04.umldiagrams.grocerystoreapplication;

public class GroceryStoreApp {
    public static void main(String[] args) {
        // create instance of Customer class
        Customer alice = new Customer("Alice");
        // add product to customer class
        alice.addProduct(new Product("Apples", 3.0, 2.0));
        alice.addProduct(new Product("Milk", 2.0, 1.0));
        // generate bill by using bill generator class
        BillGenerator.generateBill(alice);
    }
}

package Week_02.Day_04.umldiagrams.grocerystoreapplication;

public class BillGenerator {
    // Method to generate bill of customer
    public static void generateBill(Customer customer){
        System.out.println("Bill for Customer: "+ customer.getName());
        double totalAmount = 0.0;

        for(Product product: customer.getProducts()){
            double productTotal = product.calculateTotalPrice();
            System.out.println(product.getName()+" ("+ product.getQuantity()+ " units at "+ product.getPricePerUnit()+" per unit): "+ productTotal);
            totalAmount += productTotal;
        }
    }
}

package Week_02.Day_03.Level_01.ShoppingCartSystem;

public class UseProduct {
    public static void main(String[] args) {
        // create instance of Product class
        Product product1 = new Product(101,12,45.0,"Pen");
        Product product2 = new Product(102,41, 43.0, "Pencil");
        //call a method to display product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        // call a method to display current discount
        System.out.println("Discount: "+ Product.getDiscount());
        // call a method to update discount
        Product.updateDiscount(9.5);
        System.out.println();
        // call a method to display new discount
        System.out.println("New Discount: "+ Product.getDiscount());
    }
}

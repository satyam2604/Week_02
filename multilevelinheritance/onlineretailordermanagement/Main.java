package Week_02.Day_05.multilevelinheritance.onlineretailordermanagement;

public class Main {
    public static void main(String[] args) {
    // create instances of all the class to achieve multiple forms of method
        Order order = new Order(101, "21 Jan");
        Order ship = new ShippedOrder(101, "21 Jan", 123456);
        Order deliver = new DeliveredOrder(101, "21 Jan", 123456, "25 Jan");

        // display every version of method
        order.getOrderStatus();
        System.out.println();
        ship.getOrderStatus();
        System.out.println();
        deliver.getOrderStatus();
    }
}

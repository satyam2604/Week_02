package Week_02.Day_05.multilevelinheritance.onlineretailordermanagement;

public class Order {
    // common attributes of Order class
    int orderId;
    String orderDate;
    // constructor to initialize attributes of order class
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
//    method to get status of order
    public void getOrderStatus(){
        System.out.println("Order ID: "+ orderId);
        System.out.println("Order Date: "+ orderDate);
    }
}

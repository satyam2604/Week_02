package Week_02.Day_05.multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order {
//    extend attributes of Order class in ShippedOrder class
    int trackingNumber;
    public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
//  override get order status method
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking number: "+ trackingNumber);
    }
}

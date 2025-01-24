package Week_02.Day_05.multilevelinheritance.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder{
//    extend features of shipped order class in delivered order class
    String deliveryDate;
    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
//  override get order status method
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery date: "+ deliveryDate);
    }
}

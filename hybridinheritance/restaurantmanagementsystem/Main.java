package Week_02.Day_05.hybridinheritance.restaurantmanagementsystem;

public class Main {
    public static void main(String[] args) {
        // create instance of person and worker with help of chef and waiter to extend its features
        Chef chef = new Chef("Peter", 30);
        Waiter waiter = new Waiter("Shaun", 35);

        // call methods to display duties they perform
        chef.performDuties();
        waiter.performDuties();
    }
}

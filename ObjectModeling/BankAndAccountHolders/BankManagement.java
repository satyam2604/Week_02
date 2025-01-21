package Week_02.Day_04.ObjectModeling.BankAndAccountHolders;

public class BankManagement {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC"); // create a bank instance
        Customer customer = new Customer("Peter"); // create a customer instance

        // open accounts for the customer
        bank.openAccount(customer, 500.);
        bank.openAccount(customer, 450.45);

        // Customer view their account balances
        customer.viewBalance();
    }
}

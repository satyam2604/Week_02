package week_02.Day_04.ObjectModeling.BankAndAccountHolders;

public class Bank {
    // fields
    private String name; // Name of the bank
    // constructor
    public Bank(String name) {
        this.name = name;
    }
    // method to open a new account for a customer
    public Account openAccount(Customer customer, double initialDeposit){
        Account newAccount = new Account(this, initialDeposit); // Create a new account linked to this bank
        customer.addAccount(newAccount); // Associate the account with the customer
        return newAccount; // Return newly created account
    }
    // Getter method for bank name
    public String getName(){
        return name;
    }
}

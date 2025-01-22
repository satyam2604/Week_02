package week_02.Day_04.ObjectModeling.BankAndAccountHolders;

public class Account {
    private Bank bank; // Reference to the bank where the account is held
    private double balance; // Account balance
    // constructor
    public Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }
    // Getter method to retrieve the associated bank
    public Bank getBank() {
        return bank;
    }
    // Getter method to retrieve the account balance
    public double getBalance() {
        return balance;
    }
}

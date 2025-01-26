package Week_02.Day_06.bankingsystem;
// Abstract class BankAccount to represent a generic bank account
abstract class BankAccount {
    // Private fields for account details (encapsulation)
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter method for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for holderName
    public String getHolderName() {
        return holderName;
    }

    // Setter method for holderName
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Current balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    // Abstract method to calculate interest (to be implemented by subclasses)
    public abstract double calculateInterest();
}
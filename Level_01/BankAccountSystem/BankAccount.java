package Week_02.Day_03.Level_01.BankAccountSystem;

public class BankAccount {
    // fields
    private static String bankName = "HDFC"; // class variable
    private static int totalaccounts = 0; // class variable
    private final long  accountNumber; // final variable
    private String accountHolderName; //instance variable
    private double balance; // instance variable

    // Constructor
    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalaccounts++; // increament on every object call
    }

    // Static method to get total accounts
    public static int getTotalaccounts(){
        return totalaccounts;
    }

    // Method to display account details
    public void displayAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name: "+ bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }else{
            System.out.println("Invalid account instance!!");
        }
    }
}

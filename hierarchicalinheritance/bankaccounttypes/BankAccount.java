package Week_02.Day_05.hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    // attributes which is common to all bank account
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // method to display account type
    public void displayAccountType(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account balance: "+ balance);
    }
}

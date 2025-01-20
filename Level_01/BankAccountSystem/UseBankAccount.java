package Week_02.Day_03.Level_01.BankAccountSystem;

public class UseBankAccount {
    public static void main(String[] args) {
        // creating instance of bank account class
        BankAccount bankAccount1 = new BankAccount("Shaun", 1234567890, 500.);
        BankAccount bankAccount2 = new BankAccount("Peter", 1234567809,501.0);
        // call methods to display account details
        bankAccount1.displayAccountDetails();
        System.out.println(); // add extra line
        bankAccount2.displayAccountDetails();
        System.out.println(); // add extra line
        System.out.println("Total Bank Accounts: "+ BankAccount.getTotalaccounts()); // display total number of bank accounts
    }
}

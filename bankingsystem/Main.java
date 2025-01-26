package Week_02.Day_06.bankingsystem;

public class Main {
    // Method to process and display account details
    public static void processAccount(BankAccount account) {
        System.out.println("Account Holder: " + account.getHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Interest Earned: " + account.calculateInterest());

        // Check if the account is loanable
        if (account instanceof Loanable) {
            Loanable loanable = (Loanable) account;
            loanable.applyForLoan();
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of bank accounts (polymorphism with BankAccount reference)
        BankAccount[] accounts = new BankAccount[2];

        // Add a savings account to the array
        accounts[0] = new SavingsAccount("SA123", "Alice", 10000);

        // Add a current account to the array
        accounts[1] = new CurrentAccount("CA456", "Bob", 20000);

        // Process and display details for all accounts
        for (BankAccount account : accounts) {
            processAccount(account);
        }
    }
}

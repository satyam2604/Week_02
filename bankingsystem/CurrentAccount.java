package Week_02.Day_06.bankingsystem;

// Subclass CurrentAccount extending BankAccount and implementing Loanable
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // Interest rate for current accounts

    // Constructor to initialize current account details
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Overridden method to calculate interest for current accounts
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implementation of applyForLoan method
    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account.");
    }

    // Implementation of calculateLoanEligibility method
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Loan eligibility is 5 times the balance
    }
}

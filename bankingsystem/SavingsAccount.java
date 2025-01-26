package Week_02.Day_06.bankingsystem;

// Subclass SavingsAccount extending BankAccount and implementing Loanable
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // Interest rate for savings accounts

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Overridden method to calculate interest for savings accounts
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implementation of applyForLoan method
    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account.");
    }

    // Implementation of calculateLoanEligibility method
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 10; // Loan eligibility is 10 times the balance
    }
}

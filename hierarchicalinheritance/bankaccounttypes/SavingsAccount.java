package Week_02.Day_05.hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {
    // extend attributes of Bank Account class
    double interestRate;
    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
//  override display account type method
    @Override
    public void displayAccountType() {
        System.out.println("Savings Account: ");
        super.displayAccountType();
        System.out.println("Interest rate: " + interestRate);
    }
}

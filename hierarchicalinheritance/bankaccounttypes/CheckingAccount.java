package Week_02.Day_05.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount  {
    // extend attributes of Bank Account class
    int withdrawalLimit;
    public CheckingAccount(long accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    // override display account type details
    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
        super.displayAccountType();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

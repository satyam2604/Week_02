package Week_02.Day_05.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{
    //// extend attributes of Bank Account class
    String duration;
    public FixedDepositAccount(long accountNumber, double balance, String duration) {
        super(accountNumber, balance);
        this.duration= duration;
    }
    // override display account type
    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        super.displayAccountType();
        System.out.println("Duration: "+ duration);
    }
}

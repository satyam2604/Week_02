package Week_02.Day_05.hierarchicalinheritance.bankaccounttypes;

public class Main {
    public static void main(String[] args) {
    // creating instances of all subclass to achieve Hierarchical inheritance
        BankAccount saving = new SavingsAccount(1234567890,530,5.6);
        BankAccount check = new CheckingAccount(1234567890, 530, 500);
        BankAccount fixed = new FixedDepositAccount(1234567890, 530, "20 Years");

        // display details of all bank account type
        saving.displayAccountType();
        System.out.println();
        check.displayAccountType();
        System.out.println();
        fixed.displayAccountType();
    }
}

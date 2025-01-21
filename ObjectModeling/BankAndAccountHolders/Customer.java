package Week_02.Day_04.ObjectModeling.BankAndAccountHolders;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name; // Name of customer
    private List<Account> accounts; // List to store customers bank accounts
        // constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account to the customer's account list
    public void addAccount(Account account){
        accounts.add(account);
    }

    // Method to view balance of all accounts
    public void viewBalance(){
        System.out.println("Account balances for "+ name + " : ");
        for(Account acc : accounts){
            System.out.println("Bank: "+ acc.getBank().getName()+ ", Balance: "+ acc.getBalance());
        }
    }
}

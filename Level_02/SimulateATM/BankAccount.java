/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_02.SimulateATM;

/**
 *
 * @author User
 */
public class BankAccount {

    // declare attributes in Bank Account class
    private String accountHolder;
    private long accountNumber;
    private double balance;

    //  create a constructor to initialize values to it
    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to deposit money from account
    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("The deposit is successfull.");
    }

    // method to withdraw money from account
    public void withdrawAmount(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("The amount has been withdrawn");
        } else {
            System.out.println("The amount is not available.");
        }
    }

    // method to display current balance
    public void displayBalance() {
        System.out.println("The current balance is: " + balance);
    }
}

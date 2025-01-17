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
public class UseBankAccount {

    public static void main(String[] args) {
        // define values to pass to the object
        String accountHolder = "XYZ";
        long accountNumber = 1236547890l;
        double balance = 245.0;

        // create object of bank account class
        BankAccount bank = new BankAccount(accountHolder, accountNumber, balance);

        // call a mthod to deposite ammount
        bank.depositAmount(250);

        // call a method to withdraw ammount 
        bank.withdrawAmount(150);

        // call a method to display bank balance
        bank.displayBalance();

    }
}

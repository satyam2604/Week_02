/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.AccessModifiers.BankAccountManagement;

/**
 *
 * @author User
 */
public class UseBankAccount {

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount bankAccount = new BankAccount("1234567890", "John Doe", 5000.0);
        bankAccount.displayAccountDetails();
        System.out.println();

        // Modifying balance using public methods
        bankAccount.deposit(1000.0);
        bankAccount.withdraw(2000.0);
        System.out.println("After transactions:");
        bankAccount.displayAccountDetails();
        System.out.println();

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("0987654321", "Alice Smith", 10000.0, 5.0);
        savingsAccount.displaySavingsAccountDetails();
    }
}

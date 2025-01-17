/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_02.PalindromeChecker;

/**
 *
 * @author User
 */
public class UsePalindromeChecker {
    public static void main(String[] args) {
        // define values to pass to object
        String text1 = "naman";
        String text2 = "hello";
        
        // create object of PalindromeChecker class
        PalindromeChecker pc1 = new PalindromeChecker(text1);
        PalindromeChecker pc2 = new PalindromeChecker(text2);
        
        // call a method to check if string is palindrome or not
        pc1.displayResult();;
        pc2.displayResult();
    }
}

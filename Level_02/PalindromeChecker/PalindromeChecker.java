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
public class PalindromeChecker {

    // decllare variable of PalindromeChecker class
    private String text;

    //  create a constructor to initialize values to it
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // method to check if String is palindrome or not
    public boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    //  method to display if String is palindrome or not
    public void displayResult() {
        if (isPalindrome(text)) {
            System.out.println(text + " is Palindrome.");
        } else {
            System.out.println(text + " is not Palindrome.");
        }
    }
}

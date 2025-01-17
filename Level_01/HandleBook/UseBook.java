/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.HandleBook;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class UseBook {

    public static void main(String[] args) {
        // create scanner object for user input
        Scanner sc = new Scanner(System.in);
        // take title of book as input from user
        System.out.print("Enter title of book: ");
        String title = sc.nextLine();
        // take name of employee as input from user
        System.out.print("Enter author of book: ");
        String author = sc.nextLine();
        // take price of book as a input from user
        System.out.print("Enter price of book: ");
        double price = sc.nextDouble();

        // create object of Book class
        Book book = new Book(title, author, price);

        // call a method to diplay book details
        book.displayBookDetails();
    }
}

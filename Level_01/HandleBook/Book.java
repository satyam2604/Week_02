/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_01.HandleBook;

/**
 *
 * @author User
 */
public class Book {

    // declare attributes of book 
    private String title;
    private String author;
    private double price;

    // create a constructor to initialize values to it
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // call a method to display book details
    public void displayBookDetails() {
        System.out.println("The title of book is: " + title);
        System.out.println("The author of book is: " + author);
        System.out.println("The price of book is: " + price);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.Level_01;

/**
 *
 * @author User
 */
public class UseBook {

    public static void main(String[] args) {

        System.out.println("Non parameterised constructor is called!!");
        // Create a Book object using the default constructor
        Book book = new Book();
        // Display details of the book
        book.displayBookDetails();

        System.out.println();
        System.out.println("Parameterised constructor is called!!");
        // Create a Book object using the parameterized constructor
        Book books = new Book("C++", "By me", 250.36);
        // Display details of the book
        books.displayBookDetails();
    }
}

class Book {

    // declare attributes of book
    private String title;
    private String author;
    private double price;

    // create a default constructor
    public Book() {
        title = "Java Fundamentals";
        author = "Herbert Schildt";
        price = 512.50;
    }

    // create a parameterized constructor to initialize values to it
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

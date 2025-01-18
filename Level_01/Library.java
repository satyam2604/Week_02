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
public class Library {

    public static void main(String[] args) {
        // Create book instances
        Books book1 = new Books("Harry Potter", "J.K.Rowling", 1099, true);
        Books book2 = new Books("Avengers", "Kevin Fiege", 1299, false);

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Attempt to borrow books
        System.out.println("\nAttempting to borrow books:");
        book1.borrowBook();
        book2.borrowBook();

        // Display book details again
        System.out.println("\nUpdated book details:");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}

class Books {

    // Declare attributes of book
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Create a parameterized constructor to initialize values
    public Books(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("The title of book is: " + title);
        System.out.println("The author of book is: " + author);
        System.out.println("The price of book is: " + price);
        System.out.println("Status of book: " + (availability ? "available" : "not available"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            System.out.println("The book \"" + title + "\" has been successfully borrowed.");
            availability = false; // Update the availability status
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available for borrowing.");
        }
    }
}

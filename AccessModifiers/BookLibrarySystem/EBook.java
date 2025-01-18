/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.AccessModifiers.BookLibrarySystem;

/**
 *
 * @author User
 */
// Subclass
class EBook extends Book {

    private double fileSize; // In MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public field from parent class
        System.out.println("Title: " + title); // Accessing protected field from parent class
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Author: " + getAuthor()); // Accessing private field through public method
    }
}

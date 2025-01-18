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
public class Book {

    // fields
    public String ISBN; //public
    protected String title; // protected
    private String author; //private

    // create a constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }
    
    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

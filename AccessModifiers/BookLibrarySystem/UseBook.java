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
public class UseBook {
    public static void main(String[] args) {
         // Creating a Book object
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book.displayBookDetails();
        System.out.println();

        // Modifying author name using public methods
        book.setAuthor("Jane Smith");
        System.out.println("After updating author:");
        book.displayBookDetails();
        System.out.println();

        // Creating an EBook object
        EBook ebook = new EBook("978-1-40-289462-6", "Data Science Basics", "Alice Johnson", 2.5);
        ebook.displayEBookDetails();
    }
}

package Week_02.Day_04.ObjectModeling.LibraryAndBooks;
import java.util.ArrayList;
import java.util.List;
public class LibraryManagement {
    public static void main(String[] args) {
        // create intances of library class
        Library library1 = new Library("College Library");
        Library library2 = new Library("Central Block library");

        // create intances of book class

        Book book1 = new Book("Harry Potter", "JK Rowling");
        Book book2 = new Book("Avenegers", "Marvels");
        Book book3 = new Book("Mutants", "X-Mens");

        // add books to library
        library1.addBook(book1);
        library2.addBook(book2);
        library2.addBook(book3);

        // display books in each library
        library1.showAllBooks();
        System.out.println();
        library2.showAllBooks();
    }
}

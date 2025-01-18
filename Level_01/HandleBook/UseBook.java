package Week_02.Day_02.Level_01.HandleBook;

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

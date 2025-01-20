package Week_02.Day_03.Level_01.LibraryManagementSystem;

public class UseBook {
    public static void main(String[] args) {
        // creating instances of Book class
        Book book1 = new Book(456,"J.K. Rowling", "Harry Potter");
        Book book2 = new Book(455, "Avengers", "Marvels");
        // call methods to display book details
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();
        // call a static method to display library in which books are present
        System.out.println("Library is: " + Book.displayLibraryName());
    }
}

package Week_02.Day_04.objectmodeling.LibraryAndBooks;

public class Book {
    // fields
    private String title; // instance variable
    private String author; // instance variable

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
        // method to return title name
    public String getTitle() {
        return title;
    }
        // method to return author name
    public String getAuthor() {
        return author;
    }
}

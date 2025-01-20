package Week_02.Day_03.Level_01.LibraryManagementSystem;

public class Book {
    // fields
    private static String libraryName = "Library"; // static variable
    private String title; // instance variable
    private String authorName; // instance variable
    private final int ISBN; //final variable

    // Constructor
    public Book(int ISBN, String authorName, String title) {
        this.ISBN = ISBN;
        this.authorName = authorName;
        this.title = title;
    }

    // static method to display library name
    public static String displayLibraryName(){
        return libraryName;
    }

    // Method to display Book details
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + authorName);
            System.out.println("ISBN: " + ISBN);
        }else{
            System.out.println("Enter valid details");
        }
    }
}

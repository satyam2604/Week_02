package week_02.Day_04.ObjectModeling.LibraryAndBooks;
import java.util.ArrayList;
import java.util.List;
public class Library {
    // fields
    private String libraryName; // instance variable
    private List<Book> books; // Aggregation (Library has Books)
        // constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>(); // create an ArrayList of Books
    }
    // method to add ArrayList of Books
    public void addBook(Book book){
        books.add(book);
    }
    // method to show books with their title and author names
    public void showAllBooks(){
        System.out.println("Books in: "+ libraryName+ " : ");
        for(Book book: books){
            System.out.println(book.getTitle()+" by "+ book.getAuthor());
        }
    }

}

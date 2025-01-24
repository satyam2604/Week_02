package Week_02.Day_05.singleinheritance;

public class Main {
    public static void main(String[] args) {
    // create instance of author class extending book class methods and attributes
        Book author = new Author("Harry Potter", 2000, "JK Rowling", "Passionate");
        
        // display information about books
        author.displayInfo();
    }
}

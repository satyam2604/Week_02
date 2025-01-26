package Week_02.Day_06.librarymanagementsystem;
// Abstract class LibraryItem to represent a generic library item
abstract class LibraryItem {
    // Private fields for library item details (encapsulation)
    private String itemId;
    private String title;
    private String author;

    // Constructor to initialize library item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter method for itemId
    public String getItemId() {
        return itemId;
    }

    // Setter method for itemId
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Concrete method to get library item details
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method to get loan duration (to be implemented by subclasses)
    public abstract int getLoanDuration();
}

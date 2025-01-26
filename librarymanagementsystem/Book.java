package Week_02.Day_06.librarymanagementsystem;

// Subclass Book extending LibraryItem and implementing Reservable
class Book extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 21; // Loan duration for books in days
    private boolean isAvailable = true; // Availability status

    // Constructor to initialize book details
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Overridden method to get loan duration for books
    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    // Implementation of reserveItem method
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    // Implementation of checkAvailability method
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

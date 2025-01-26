package Week_02.Day_06.librarymanagementsystem;

// Subclass Magazine extending LibraryItem and implementing Reservable
class Magazine extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 7; // Loan duration for magazines in days
    private boolean isAvailable = true; // Availability status

    // Constructor to initialize magazine details
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Overridden method to get loan duration for magazines
    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    // Implementation of reserveItem method
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is currently unavailable.");
        }
    }

    // Implementation of checkAvailability method
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

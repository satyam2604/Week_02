package Week_02.Day_06.librarymanagementsystem;

// Subclass DVD extending LibraryItem and implementing Reservable
class DVD extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 14; // Loan duration for DVDs in days
    private boolean isAvailable = true; // Availability status

    // Constructor to initialize DVD details
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Overridden method to get loan duration for DVDs
    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    // Implementation of reserveItem method
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }

    // Implementation of checkAvailability method
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

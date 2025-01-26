package Week_02.Day_06.librarymanagementsystem;

public class Main {
    // Method to process and display library item details
    public static void processLibraryItem(LibraryItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        // Check if the item is reservable
        if (item instanceof Reservable) {
            Reservable reservable = (Reservable) item;
            System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            reservable.reserveItem();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of library items (polymorphism with LibraryItem reference)
        LibraryItem[] items = new LibraryItem[3];

        // Add a book to the array
        items[0] = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald");

        // Add a magazine to the array
        items[1] = new Magazine("M202", "National Geographic", "Editorial Team");

        // Add a DVD to the array
        items[2] = new DVD("D303", "Inception", "Christopher Nolan");

        // Process and display details for all library items
        for (LibraryItem item : items) {
            processLibraryItem(item);
        }
    }
}

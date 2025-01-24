package Week_02.Day_05.singleinheritance;

public class Book {
    // attributes of BOOK class
    String title;
    int publicationYear;
    // constructor to initialize book's attributes
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    // method to display details of book
    public void displayInfo(){
        System.out.println("Title: "+ title);
        System.out.println("Publication year: "+ publicationYear);
    }
}

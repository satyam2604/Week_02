package Week_02.Day_05.singleinheritance.bookandauthor;

public class Author extends Book {
    // extend attributes of book class author with extra attributes in author class
    String name; // name of author
    String bio; // bio of author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    // override display info method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author name: "+ name);
        System.out.println("Author Bio: "+ bio);
    }
}

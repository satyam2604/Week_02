package Week_02.Day_05.multilevelinheritance.educationalcoursehierarchy;

public class Main {
    public static void main(String[] args) {
    // create instance of paid online course class extending features of course and online course class
        Course paid = new PaidOnlineCourse("Java FullStack", "12 Months", "Google Meet", true, 12000, 5);

        // display detail of course
        paid.displayDetails();
    }
}

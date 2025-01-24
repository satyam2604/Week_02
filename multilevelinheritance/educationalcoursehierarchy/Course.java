package Week_02.Day_05.multilevelinheritance.educationalcoursehierarchy;

public class Course {
    // attributes common to all courses.
    String courseName;
    String duration;
    // constructor to initialize attributes of Course class
    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    // method to display details of course
    public void displayDetails(){
        System.out.println("Course name: "+ courseName);
        System.out.println("Course Duration: "+ duration);
    }
}

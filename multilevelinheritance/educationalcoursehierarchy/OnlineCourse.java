package Week_02.Day_05.multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course {
    // extend attributes of Course class to online courses
    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    // override display details method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: "+ isRecorded);
    }
}

package Week_02.Day_05.multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    // extend attributes of onlinecourse in paidonlinecourse class
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount =discount;
    }
    // override display details method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: "+ fee);
        System.out.println("Discount: "+ discount);
    }
}

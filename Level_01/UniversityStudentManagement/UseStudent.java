package Week_02.Day_03.Level_01.UniversityStudentManagement;

public class UseStudent {
    public static void main(String[] args) {
        // create instance of Student class
        Student student1 = new Student(101,"Peter", "A+");
        Student student2 = new Student(102, "Shanu", "A");
        // call a method to display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        // call a method to display total studets
        System.out.println("Total students: "+ Student.getTotalStudents());
    }
}

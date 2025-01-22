package Week_02.Day_04.umldiagrams.schoolresultapplication;

public class SchoolResultApp {
    public static void main(String[] args) {
        // create instance of Student class
        Student student = new Student("John");
        // add subjects for Student
        student.addSubject(new Subject("Maths",90));
        student.addSubject(new Subject("Science",85));
        // display name of students with subjects
        System.out.println("Student: "+ student.getName());
        for (Subject subject: student.getSubjects()){
            System.out.println("Subject: "+ subject.getName()+", Marks: "+ subject.getScore());
        }
        // call method to get grade of student
        char grade = GradeCalculator.gradeCalculator(student);
        System.out.println("Grade: "+ grade);
    }
}

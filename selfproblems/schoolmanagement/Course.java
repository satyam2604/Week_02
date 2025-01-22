package Week_02.Day_04.selfproblems.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName; // name of course
    private List<Student> enrolledStudents; // list of students enrolled in course
        // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
        // method to return course name
    public String getCourseName() {
        return courseName;
    }
        // method to add enrolled students to list
    public void enrollStudents(Student student){
        enrolledStudents.add(student);
    }
        // method to display enrolled students
    public void showEnrolledStudents(){
        System.out.println("Students enrolled in "+ courseName+ " : ");
        for(Student student : enrolledStudents){
            System.out.println(student.getName());
        }
    }
}

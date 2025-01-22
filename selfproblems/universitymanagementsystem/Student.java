package Week_02.Day_04.selfproblems.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId; // student id
    private String studentName; //student name
    private List<Course> courses; // list of courses

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }
    // Method for student to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);  // Adding course to the list
    }
    // Method to get student details as string
    @Override
    public String toString() {
        StringBuilder courseList = new StringBuilder();  // StringBuilder for course details
        for (Course course : courses) {  // Iterating through course list
            courseList.append(course.toString()).append("\n");  // Appending course details
        }
        return "Student: " + studentName + " (ID: " + studentId + ")\nEnrolled Courses:\n" + courseList;
    }

}

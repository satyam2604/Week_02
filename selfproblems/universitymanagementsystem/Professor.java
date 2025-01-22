package Week_02.Day_04.selfproblems.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int professorId;  // Professor ID
    private String name;  // Professor name
    private List<Course> courses;  // List of assigned courses

    // Constructor to initialize Professor
    public Professor(int professorId, String name) {
        this.professorId = professorId;  // Assigning professor ID
        this.name = name;  // Assigning professor name
        this.courses = new ArrayList<>();  // Initializing course list
    }

    // Method for professor to teach a course
    public void teachCourse(Course course) {
        courses.add(course);  // Adding course to the list
        course.assignProfessor(this);  // Assigning professor to the course
    }

    // Method to get professor name
    public String getName() {
        return name;  // Returning professor name
    }

    // Method to get professor details as string
    @Override
    public String toString() {
        StringBuilder courseList = new StringBuilder();  // StringBuilder for course details
        for (Course course : courses) {  // Iterating through course list
            courseList.append(course.toString()).append("\n");  // Appending course details
        }
        return "Professor: " + name + " (ID: " + professorId + ")\nCourses Taught:\n" + courseList;
    }
}


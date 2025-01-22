package Week_02.Day_04.selfproblems.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name; // student name
    private List<Course> courses; // list of course
        // constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
        // method to get name of student
    public String getName() {
        return name;
    }
    // method to add students in course
    public void enrollInCourse(Course course){
        courses.add(course);
        course.enrollStudents(this);
    }

    // method to show enrolled courses
    public void showEnrolledCourses(){
        System.out.println(name+ " is enrolled in: ");
        for(Course course: courses){
            System.out.println(course.getCourseName());
        }
    }
}

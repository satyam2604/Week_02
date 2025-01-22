package Week_02.Day_04.selfproblems.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName; // school name
    private List<Student> students; // list of students
        // constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }
    // method to add students in list
    public void addStudent(Student student){
        students.add(student);
    }
    // method to show all students
    public void showAllStudents(){
        System.out.println("Students in "+ schoolName + " : ");
        for(Student student: students){
            System.out.println(student.getName());
        }
    }
}

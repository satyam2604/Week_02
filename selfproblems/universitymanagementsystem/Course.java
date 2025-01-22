package Week_02.Day_04.selfproblems.universitymanagementsystem;

public class Course {
    private String courseName; // name of course
    private int courseId; // course id
    private Professor professor; // Professor assigned to course
    // constructor
    public Course(int courseId, String courseName) {
        this.courseName = courseName;
        this.courseId = courseId;
    }
    // method to assign professor to course
    public void assignProfessor(Professor professor){
        this.professor = professor;
    }
    // Method to get course details as string
    @Override
    public String toString() {
        return "Course: " + courseName + " (ID: " + courseId + ")" + "\nProfessor: " + (professor != null ? professor.getName() : "None");
    }

}

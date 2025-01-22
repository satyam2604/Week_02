package Week_02.Day_04.selfproblems.universitymanagementsystem;

public class UniversitySystem {
    public static void main(String[] args) {
        // Creating courses
        Course course1 = new Course(101, "Mathematics");
        Course course2 = new Course(102, "Physics");

        // Creating a student
        Student student = new Student(201, "Peter");

        // Student enrolls in courses
        student.enrollCourse(course1);
        student.enrollCourse(course2);

        // Creating a professor
        Professor professor = new Professor(301, "Nischal");

        // Professor teaches courses
        professor.teachCourse(course1);
        professor.teachCourse(course2);

        // Printing student details
        System.out.println(student);

        // Printing professor details
        System.out.println(professor);
    }
}

package Week_02.Day_04.selfproblems.schoolmanagement;

public class SchoolManagement {
    public static void main(String[] args) {
        // create instance of School class
        School school = new School("Ideal Academy");
        // create instance of Student class
        Student s1 = new Student("Peter");
        Student s2 = new Student("Chris");
        // create instance of course class
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollInCourse(c1); // Enroll Peter in Math
        s1.enrollInCourse(c2); // Enroll Peter in Science
        s2.enrollInCourse(c1); // Enroll Chris in Math
        // add student to list
        school.addStudent(s1);
        school.addStudent(s2);

        // Display enrolled courses for students
        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        // Display students enrolled in a course
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();

        // Display all students in the school
        school.showAllStudents();

    }
}

package Week_02.Day_04.umldiagrams.schoolresultapplication;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name; // name of student
    private List<Subject> subjects; // list of subjects

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    // method to add subject to list
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    // getter method to get name of student
    public String getName() {
        return name;
    }
    // getter method to get list of subjects
    public List<Subject> getSubjects() {
        return subjects;
    }
}

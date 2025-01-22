package Week_02.Day_04.umldiagrams.schoolresultapplication;

public class GradeCalculator {
    // method to calculate grade of students
    public static char gradeCalculator(Student student){
        int totalScore = 0; // variable to calculate total score
        for(Subject subject : student.getSubjects()){
            totalScore += subject.getScore();
        }
        // variable to calculate average
        int averageScore = totalScore/student.getSubjects().size();
        if(averageScore>= 90) return 'A';
        else if(averageScore>=80) return 'B';
        else if(averageScore>=70) return 'C';
        else if (averageScore>=60) return 'D';
        else if (averageScore>=33) return 'E';
        else return 'F';
    }
}

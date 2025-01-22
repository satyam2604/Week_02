package Week_02.Day_04.umldiagrams.schoolresultapplication;

public class Subject {
    private String name; // subject name
    private int score; // score of particular subject
    // constructor
    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }
    // Getter method to get name of subject
    public String getName() {
        return name;
    }
    // Getter method to get score of subject
    public int getScore() {
        return score;
    }
}

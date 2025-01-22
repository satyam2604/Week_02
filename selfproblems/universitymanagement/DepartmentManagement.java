package Week_02.Day_04.selfproblems.universitymanagement;

public class DepartmentManagement {
    public static void main(String[] args) {
        // create instance of university class
        University uni = new University("RGPV");

        // Add departments to university
        uni.addDepartment("Computer Science");
        uni.addDepartment("IT");

        // Create faculty members instances
        Faculty faculty1 = new Faculty("Manoj");
        Faculty faculty2 = new Faculty("Nischal");

        // show university details
        uni.showDetails();

        // show independent faculty members
        faculty1.display();
        faculty2.display();

        // deleting the university details
        uni.deleteUniversity();
    }
}

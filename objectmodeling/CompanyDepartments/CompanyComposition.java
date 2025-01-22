package Week_02.Day_04.objectmodeling.CompanyDepartments;

public class CompanyComposition {
    public static void main(String[] args) {
        // create a company instance
        Company company = new Company("Google");

//        Create departments
        Department hr = new Department("HR");
        Department it = new Department("IT");

        // add employees to departments
        hr.addEmployee(new Employee("Peter",101));
        hr.addEmployee(new Employee("Shaun", 102));
        it.addEmployee(new Employee("Chris",201));
        it.addEmployee(new Employee("Robert",202));

        // add departments to company
        company.addDepartments(hr);
        company.addDepartments(it);

        // display company
        company.display();
    }
}

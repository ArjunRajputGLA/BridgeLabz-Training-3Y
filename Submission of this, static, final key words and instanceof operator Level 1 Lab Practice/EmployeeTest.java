public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arjun", 1, "Developer");
        Employee e2 = new Employee("Raj", 2, "Manager");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}

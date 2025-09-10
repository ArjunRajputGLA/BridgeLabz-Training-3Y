public class Employee {
    static String companyName = "TechCorp";
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }
}

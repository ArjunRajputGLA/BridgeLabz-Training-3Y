abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class HRDepartment implements Department {
    private String deptName;

    @Override
    public void assignDepartment(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + deptName;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 500, 40);

        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());

        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());

        Department dept = new HRDepartment();
        dept.assignDepartment("Human Resources");
        System.out.println(dept.getDepartmentDetails());
    }
}

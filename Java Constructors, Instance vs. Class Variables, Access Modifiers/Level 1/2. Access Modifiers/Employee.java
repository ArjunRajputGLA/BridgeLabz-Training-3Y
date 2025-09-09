// Demonstrating encapsulation with Employee and Manager

class Employee {
    public int employeeID; // public
    protected String department; // protected
    private double salary; // private

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // public method to modify salary
    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + " | Department: " + department + " | Salary: " + getSalary() + " | Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, 10);
        m.displayDetails();
        m.setSalary(80000);
        m.displayDetails();
    }
}

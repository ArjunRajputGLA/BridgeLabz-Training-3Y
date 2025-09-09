// Demonstrating public, protected, and private with subclass

class Student {
    public int rollNumber;       // public
    protected String name;       // protected
    private double CGPA;         // private

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // public methods to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        CGPA = newCGPA;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + " | Name: " + name + " | CGPA: " + getCGPA() + " | Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Aman", 8.5, "AI");
        pg.displayDetails();
        pg.setCGPA(9.0);
        pg.displayDetails();
    }
}
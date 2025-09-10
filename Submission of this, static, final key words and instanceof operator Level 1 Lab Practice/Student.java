public class Student {
    static String universityName = "XYZ University";
    private String name;
    private final int rollNumber;
    private String grade;
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber; // final
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Grade: " + grade);
        }
    }
}

// Course.java
// A simple class to manage online courses with a common institute name

public class Course {
    String courseName; // instance variable
    int duration; // in months
    double fee; // course fee
    static String instituteName = "BridgeLabz"; // class variable

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " months" + " | Fee: " + fee + " | Institute: " + instituteName);
    }

    // class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 15000);
        Course c2 = new Course("Python", 2, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("BridgeLabz Learning");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

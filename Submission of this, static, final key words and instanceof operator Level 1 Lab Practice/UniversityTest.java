public class UniversityTest {
    public static void main(String[] args) {
        Student s1 = new Student("Arjun", 101, "A");
        Student s2 = new Student("Raj", 102, "B");

        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}

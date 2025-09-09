public class StudentsGrades {
    String name;
    String roll;
    double[] marks;

    StudentsGrades(String name, String roll, double[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    String grade() {
        double avg = avgMarks();
        if (avg >= 80) return "Grade A";
        if (avg >= 60) return "Grade B";
        if (avg >= 50) return "Grade C";
        if (avg >= 40) return "Grade D";
        return "Grade F";
    }

    double avgMarks() {
        double sum = 0;
        for (double m : marks) sum += m;
        return sum / marks.length;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        for (int i = 0; i < marks.length; i++)
            System.out.println("Mark" + (i + 1) + ": " + marks[i]);
        System.out.println(grade());
    }

    public static void main(String[] args) {
        double[] m1 = {80, 70, 75};
        double[] m2 = {60, 65, 50};
        StudentsGrades s1 = new StudentsGrades("Thamarai", "ECE001", m1);
        StudentsGrades s2 = new StudentsGrades("Kannan", "CSC002", m2);
        s1.show();
        s2.show();
    }
}

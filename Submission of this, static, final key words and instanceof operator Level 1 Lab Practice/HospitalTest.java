public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient("Arjun", 25, "Flu", 201);
        Patient p2 = new Patient("Raj", 40, "Diabetes", 202);

        p1.displayDetails();
        p2.displayDetails();

        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}

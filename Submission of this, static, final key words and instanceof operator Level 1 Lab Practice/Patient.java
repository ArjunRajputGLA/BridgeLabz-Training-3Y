public class Patient {
    static String hospitalName = "City Hospital";
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    private static int totalPatients = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID; 
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", ID: " + patientID);
        }
    }
}

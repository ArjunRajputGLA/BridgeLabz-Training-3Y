import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age, int daysAdmitted, double dailyRate) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Records: " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Records: " + records);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Rahul", 40, 5, 2000);
        Patient p2 = new OutPatient(2, "Sneha", 25, 500);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());
        ((MedicalRecord) p1).addRecord("Admitted for Surgery");
        ((MedicalRecord) p1).viewRecords();

        System.out.println("---------------------");

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
        ((MedicalRecord) p2).addRecord("Consulted for Fever");
        ((MedicalRecord) p2).viewRecords();
    }
}

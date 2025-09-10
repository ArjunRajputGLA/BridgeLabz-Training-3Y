public class Vehicle {
    static double registrationFee = 1000;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", RegNo: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

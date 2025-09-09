// Vehicle.java
// A simple class to manage vehicles with fixed registration fee

public class Vehicle {
    String ownerName; // instance variable
    String vehicleType; // instance variable
    static double registrationFee = 5000; // class variable

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + " | Vehicle: " + vehicleType + " | Registration Fee: " + registrationFee);
    }

    // class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        Vehicle v2 = new Vehicle("Emma", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

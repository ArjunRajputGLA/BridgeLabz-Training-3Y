public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Arjun", "Car", "REG101");
        Vehicle v2 = new Vehicle("Raj", "Bike", "REG102");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(1500);
        v1.displayDetails();
    }
}

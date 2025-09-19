abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: Flat ₹1000";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: Flat ₹500";
    }
}

class Truck extends Vehicle {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("MH12AB1234", 2000),
            new Bike("MH12XY9999", 800),
            new Truck("MH12TR4444", 5000)
        };

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + ", Number: " + v.getVehicleNumber());
            System.out.println("Rental (5 days): " + v.calculateRentalCost(5));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails() + ", Cost: " + ins.calculateInsurance());
            }
            System.out.println("----------------------");
        }
    }
}

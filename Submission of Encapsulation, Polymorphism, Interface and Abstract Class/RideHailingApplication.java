abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // cheaper
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.2; // surcharge
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("C101", "Ramesh", 12),
            new Bike("B202", "Amit", 8),
            new Auto("A303", "Suresh", 10)
        };

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(15);
            System.out.println("Fare for 15 km: " + fare);

            if (v instanceof GPS) {
                ((GPS) v).updateLocation("MG Road");
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("--------------------");
        }
    }
}

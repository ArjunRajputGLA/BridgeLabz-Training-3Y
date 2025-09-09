public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not selected";
        this.rentalDays = 0;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days. Total cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Parmeet", "BMW X5", 5);
        cr1.display();
        cr2.display();
    }
}

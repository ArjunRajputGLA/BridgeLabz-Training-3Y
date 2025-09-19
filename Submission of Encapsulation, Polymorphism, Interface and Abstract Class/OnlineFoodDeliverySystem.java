abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Food: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra non-veg charge
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.85;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: 15%";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer Tikka", 250, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem f : items) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();

            if (f instanceof Discountable) {
                Discountable d = (Discountable) f;
                System.out.println(d.getDiscountDetails());
                total = d.applyDiscount(total);
            }

            System.out.println("Final Price: " + total);
            System.out.println("--------------------");
        }
    }
}

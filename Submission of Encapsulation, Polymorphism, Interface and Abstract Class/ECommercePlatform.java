abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(201, "Laptop", 60000),
            new Clothing(202, "Shirt", 1500),
            new Groceries(203, "Rice", 800)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName() +
                               ", Price: " + p.getPrice() +
                               ", Discount: " + discount +
                               ", Tax: " + tax +
                               ", Final Price: " + finalPrice);
        }
    }
}

public class Product {
    static double discount = 5.0; // percent
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Qty: " + quantity + ", ID: " + productID);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

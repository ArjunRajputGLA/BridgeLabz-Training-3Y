// Product.java
// A simple class to manage product details and cnt total products

public class Product {
    String productName; // instance variable
    double price;
    static int totalProds = 0; // class variable shared by all

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProds++; // increase cnt whenever a new product is made
    }

    // instance method
    public void displayProductDetails() {
        System.out.println("Product: " + productName + " | Price: " + price);
    }

    // class method
    public static void displaytotalProds() {
        System.out.println("Total products created: " + totalProds);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 25000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displaytotalProds();
    }
}

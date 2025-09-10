public class ShoppingCartTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 101);
        Product p2 = new Product("Mobile", 20000, 2, 102);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(10);
        p1.displayDetails();
    }
}

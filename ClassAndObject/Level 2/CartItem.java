public class CartItem {
    String item;
    double price;
    int qty;

    CartItem(String item, double price, int qty) {
        this.item = item;
        this.price = price;
        this.qty = qty;
    }

    void add(int q) {
        qty += q;
        System.out.println("Added " + q + " " + item);
    }

    void remove(int q) {
        if (q > qty)
            System.out.println("Not enough items to remove");
        else {
            qty -= q;
            System.out.println("Removed " + q + " " + item);
        }
    }

    double total() {
        return price * qty;
    }

    void show() {
        System.out.println(item + " Price: " + price + " Qty: " + qty);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Laptop", 999.99, 1);
        c.show();
        c.add(2);
        c.remove(1);
        System.out.println("Total: " + c.total());
    }
}

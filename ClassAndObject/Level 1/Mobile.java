public class Mobile {
    String brand, model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void show() {
        System.out.println(brand + " " + model + " " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("VIVO", "V29", 15999);
        Mobile m2 = new Mobile("OnePlus", "Nord 4", 39999);
        Mobile m3 = new Mobile("Apple", "iPhone 16 Pro", 79999);
        m1.show();
        m2.show();
        m3.show();
    }
}

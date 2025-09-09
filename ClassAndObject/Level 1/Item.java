public class Item {
    String code, name;
    double price;

    Item(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    void show() {
        System.out.println(code + " " + name + " " + price);
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item("01AA", "Water Bottle", 500),
                new Item("01BB", "Rice", 700),
                new Item("02AA", "Blackboard", 400)
        };
        for (Item i : items)
            i.show();
    }
}

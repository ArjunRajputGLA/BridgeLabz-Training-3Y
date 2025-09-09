public class Book {
    String title, author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void show() {
        System.out.println(title + " by " + author + " Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("2States", "Chetan Bhagat", 500);
        Book b2 = new Book("Wings Of Fire", "APJ Abdul Kalam", 600);
        b1.show();
        b2.show();
    }
}

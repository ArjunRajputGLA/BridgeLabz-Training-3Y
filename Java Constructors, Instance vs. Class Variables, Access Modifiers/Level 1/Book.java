public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "unknown";
        this.author = "unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book: " + title + " by " + author + " costs " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "Parmeet", 500);
        b1.display();
        b2.display();
    }
}

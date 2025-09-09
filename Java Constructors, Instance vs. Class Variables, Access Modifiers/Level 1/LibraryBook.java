public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Book: " + title + " by " + author + " | Price: " + price + " | Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("OOPS in Java", "Parmeet", 300, true);
        lb.display();
        lb.borrowBook();
        lb.display();
        lb.borrowBook();
    }
}

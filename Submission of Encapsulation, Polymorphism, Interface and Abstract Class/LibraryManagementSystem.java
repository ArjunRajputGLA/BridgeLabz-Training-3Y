abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved: " + getTitle());
        } else {
            System.out.println("Book not available!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java Programming", "James Gosling"),
            new Magazine(2, "Tech Monthly", "Editorial Team"),
            new DVD(3, "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }

        Book book = (Book) items[0];
        System.out.println("Available: " + book.checkAvailability());
        book.reserveItem();
        System.out.println("Available after reservation: " + book.checkAvailability());
    }
}

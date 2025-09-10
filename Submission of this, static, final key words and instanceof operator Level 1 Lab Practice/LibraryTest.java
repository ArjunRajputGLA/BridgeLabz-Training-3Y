public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "ISBN001");
        Book b2 = new Book("Python Basics", "Guido van Rossum", "ISBN002");

        Book.displayLibraryName();
        b1.displayDetails();
        b2.displayDetails();
    }
}

// Demonstrating access modifiers in Book and EBook

class Book {
    public String ISBN; // public
    protected String title; // protected
    private String author; // private

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // public methods to set/get private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }
}

class EBook extends Book {
    double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + " | Title: " + title + " | Author: " + getAuthor() + " | File Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123-456", "Java Basics", "James Gosling", 5.2);
        ebook.displayDetails();
        ebook.setAuthor("Updated Author");
        ebook.displayDetails();
    }
}

public class MovieTicket {
    String movie;
    String seat;
    double price;
    boolean booked;

    MovieTicket(String movie) {
        this.movie = movie;
        this.seat = "None";
        this.price = 0;
        this.booked = false;
    }

    void book(String seat, double price) {
        if (booked) {
            System.out.println("Already booked");
        } else {
            this.seat = seat;
            this.price = price;
            this.booked = true;
            System.out.println("Booked: " + movie + " Seat: " + seat + " Price: " + price);
        }
    }

    void show() {
        if (booked)
            System.out.println("Ticket: " + movie + " Seat: " + seat + " Price: " + price);
        else
            System.out.println("Not booked yet");
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Dragon");
        t.show();
        t.book("A10", 120);
        t.book("B10", 120);
        t.show();
    }
}

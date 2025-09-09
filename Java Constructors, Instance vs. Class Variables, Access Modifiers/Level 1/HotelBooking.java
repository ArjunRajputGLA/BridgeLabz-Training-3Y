public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void display() {
        System.out.println("Booking: " + guestName + " booked " + roomType + " room for " + nights + " nights.");
    }

    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("...CodeWithHarry...", "Deluxe", 3);
        HotelBooking hb3 = new HotelBooking(hb2); // copy
        hb1.display();
        hb2.display();
        hb3.display();
    }
}

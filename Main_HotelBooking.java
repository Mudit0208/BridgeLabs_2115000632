public class Main_HotelBooking {
    public static void main(String[] args) {
        // Create a HotelBooking object using the default constructor
        HotelBooking defaultBooking = new HotelBooking();

        // Create a HotelBooking object using the parameterized constructor
        HotelBooking parameterizedBooking = new HotelBooking("Chinnappa Don", "Average Room", 3);

        // Create a HotelBooking object using the copy constructor
        HotelBooking copyBooking = new HotelBooking(parameterizedBooking);

        // Display details of each booking
        System.out.println("=== Default Booking ===");
        defaultBooking.displayDetails();
        System.out.println("\n=== Parameterized Booking ===");
        parameterizedBooking.displayDetails();
        System.out.println("\n=== Copy Booking ===");
        copyBooking.displayDetails();
    }
}

public class Main_CarRental {
    public static void main(String[] args) {
        // Create CarRental objects using parameterized constructor
        CarRental rental1 = new CarRental("Chinnappa", "Toyota Corolla", 5, 45.0);
        CarRental rental2 = new CarRental("Krishna", "Honda Civic", 7, 50.0);

        // Display details of each rental
        System.out.println("=== Rental 1 ===");
        rental1.displayDetails();
        System.out.println("\n=== Rental 2 ===");
        rental2.displayDetails();
    }
}

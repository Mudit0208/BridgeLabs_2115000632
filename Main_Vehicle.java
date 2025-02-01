public class Main_Vehicle {
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Mudit", "Car");
        Vehicle vehicle2 = new Vehicle("Nikhil", "Motorcycle");

        // Display details of each vehicle
        System.out.println("=== Vehicle 1 ===");
        vehicle1.displayVehicleDetails();
        System.out.println("\n=== Vehicle 2 ===");
        vehicle2.displayVehicleDetails();

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0);

        // Display details again to see changes in registration fee
        System.out.println("\n=== Updated Registration Fee ===");
        System.out.println("=== Vehicle 1 ===");
        vehicle1.displayVehicleDetails();
        System.out.println("\n=== Vehicle 2 ===");
        vehicle2.displayVehicleDetails();
    }
}

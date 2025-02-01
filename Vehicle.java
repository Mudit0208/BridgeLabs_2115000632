public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee = 100.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display the details of a vehicle
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class method to change the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Getter for ownerName
    public String getOwnerName() {
        return ownerName;
    }

    // Setter for ownerName
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter for vehicleType
    public String getVehicleType() {
        return vehicleType;
    }

    // Setter for vehicleType
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Getter for registrationFee
    public static double getRegistrationFee() {
        return registrationFee;
    }
}

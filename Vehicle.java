class Vehicle {
    static double registrationFee = 100.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Vehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "AB1234CD");
        vehicle1.displayRegistrationDetails();
        Vehicle.updateRegistrationFee(150.0);
        vehicle1.displayRegistrationDetails();
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "XY5678ZT");
        vehicle2.displayRegistrationDetails();
    }
}

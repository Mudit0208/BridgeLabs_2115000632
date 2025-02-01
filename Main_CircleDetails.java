public class Main_CircleDetails {
    public static void main(String[] args) {
        // Create Circle objects using default constructor
        CircleDetails defaultCircle = new CircleDetails();

        // Create Circle objects using parameterized constructor
        CircleDetails parameterizedCircle = new CircleDetails(5.0);

        // Display details of each circle
        System.out.println("=== Default Circle ===");
        defaultCircle.displayDetails();
        System.out.println("\n=== Parameterized Circle ===");
        parameterizedCircle.displayDetails();
    }
}

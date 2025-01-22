import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion factors
        double feetToYards = 1.0 / 3.0; // 1 yard = 3 feet
        double feetToMiles = 1.0 / 5280.0; // 1 mile = 5280 feet

        // Calculate the distance in yards
        double distanceInYards = distanceInFeet * feetToYards;

        // Calculate the distance in miles
        double distanceInMiles = distanceInFeet * feetToMiles;

        // Print the results
        System.out.println("The distance " + distanceInFeet + " feet in yards is " + distanceInYards);
        System.out.println("The distance " + distanceInFeet + " feet in miles is " + distanceInMiles);

        scanner.close();
    }
}

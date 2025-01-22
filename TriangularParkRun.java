import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the lengths of the three sides of the triangular park in meters
        System.out.print("Enter the length of side A (in meters): ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter the length of side B (in meters): ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter the length of side C (in meters): ");
        double sideC = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = sideA + sideB + sideC;

        // Convert 5 kilometers to meters
        double distanceToRun = 5000.0;

        // Calculate the number of rounds needed to complete 5 km run
        int rounds = (int)Math.ceil(distanceToRun / perimeter);

        // Print the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 kilometers.");

        scanner.close();
    }
}

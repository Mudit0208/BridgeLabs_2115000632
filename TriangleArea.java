import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the base of the triangle in inches
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInInches = scanner.nextDouble();

        // Prompt user to enter the height of the triangle in inches
        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInInches = scanner.nextDouble();

        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert inches to centimeters (1 inch = 2.54 centimeters)
        double baseInCentimeters = baseInInches * 2.54;
        double heightInCentimeters = heightInInches * 2.54;

        // Calculate the area in square centimeters
        double areaInSquareCentimeters = 0.5 * baseInCentimeters * heightInCentimeters;

        // Print the results
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches.");
        System.out.println("The area of the triangle is " + areaInSquareCentimeters + " square centimeters.");

        scanner.close();
    }
}

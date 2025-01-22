import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Conversion factors
        double cmToInches = 0.393701;
        double inchesToFeet = 1.0 / 12.0;

        // Convert height to inches
        double heightInches = heightCm * cmToInches;

        // Convert inches to feet and inches
        int heightFeet = (int) (heightInches * inchesToFeet);
        double remainingInches = heightInches % 12;

        // Print the results
        System.out.println("Your height is " + heightFeet + " feet and " + remainingInches + " inches.");

        scanner.close();
    }
}

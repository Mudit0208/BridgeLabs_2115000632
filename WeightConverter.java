import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion factor (1 pound = 0.453592 kilograms)
        double conversionFactor = 0.453592;

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds * conversionFactor;

        // Print the result
        System.out.println("The weight in kilograms is: " + weightInKilograms);

        scanner.close();
    }
}

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the principal amount
        System.out.print("Enter the Principal amount (INR): ");
        double principal = scanner.nextDouble();

        // Prompt user to enter the rate of interest
        System.out.print("Enter the Rate of interest (% per annum): ");
        double rate = scanner.nextDouble();

        // Prompt user to enter the time period in years
        System.out.print("Enter the Time period (years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is: INR " + simpleInterest);

        scanner.close();
    }
}

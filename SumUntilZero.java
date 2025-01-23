import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        // Prompt user to enter a number
        System.out.print("Enter a number (0 to stop): ");
        double number = scanner.nextDouble();

        // Continue to sum numbers until the user enters 0
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

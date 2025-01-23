import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            // Prompt user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (number <= 0) {
                break;
            }

            // Add the entered number to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

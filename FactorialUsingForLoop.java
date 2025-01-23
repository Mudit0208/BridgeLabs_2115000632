import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number >= 0) {
            int factorial = 1;

            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}

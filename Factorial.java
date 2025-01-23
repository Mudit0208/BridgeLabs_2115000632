import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number >= 0) {
            int factorial = 1;
            int i = 1;

            // Compute the factorial using a while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number (dividend)
        System.out.print("Enter the first number (dividend): ");
        int dividend = scanner.nextInt();

        // Prompt user to enter the second number (divisor)
        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        // Calculate the quotient
        int quotient = dividend / divisor;

        // Calculate the remainder
        int remainder = dividend % divisor;

        // Print the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}

import java.util.Scanner;

public class NaturalNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;
            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Indicate that the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        scanner.close();
    }
}

import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get an integer input for the number variable
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        int originalNumber = number;
        // Create a while loop to access each digit of the number
        while (originalNumber != 0) {
            // Find the remainder (last digit)
            int remainder = originalNumber % 10;
            // Add each digit of the number to sum
            sum += remainder;
            // Remove the last digit from originalNumber
            originalNumber /= 10;
        }
        // Check if the number is perfectly divisible by the sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
        scanner.close();
    }
}

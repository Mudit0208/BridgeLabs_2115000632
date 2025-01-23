import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get an integer input and store it in the number variable
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        int originalNumber = number;
        // Use the while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder (last digit)
            int remainder = originalNumber % 10;
            // Find the cube of the remainder and add it to the sum
            sum += remainder * remainder * remainder;
            // Find the quotient and update the originalNumber (remove last digit)
            originalNumber /= 10;
        }
        // Check if the number and the sum are the same
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }
}

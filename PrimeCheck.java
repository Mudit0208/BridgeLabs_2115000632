import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        // Check if the number is greater than 1
        if (number > 1) {
            // Loop through all numbers from 2 to the entered number
            for (int i = 2; i <= number / 2; i++) {
                // Check if the number is divisible by any number other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        int low = 1;
        int high = 100;
        boolean correctGuess = false;

        while (!correctGuess) {
            int guess = generateGuess(low, high, random);
            System.out.println("My guess is: " + guess);

            System.out.print("Is my guess too high, too low, or correct? (Enter 'high', 'low', or 'correct'): ");
            String feedback = scanner.nextLine().trim().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                correctGuess = true;
                System.out.println("Hooray! I guessed your number.");
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        scanner.close();
    }

    // Method to generate a random guess between low and high (inclusive)
    public static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}

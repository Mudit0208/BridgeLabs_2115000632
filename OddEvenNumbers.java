import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number > 0) {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}

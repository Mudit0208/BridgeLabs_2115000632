import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get an integer input for the number variable
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                // Add i to sum
                sum += i;
            }
        }
        // Check if sum is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
        scanner.close();
    }
}

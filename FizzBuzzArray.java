import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        // Check if the number is a positive integer
        if (number > 0) {
            // Create a String array to save the results
            String[] results = new String[number + 1];
            // Loop from 0 to the number and save the results in the array
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }
            // Print the array results based on the index position
            for (int i = 1; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}

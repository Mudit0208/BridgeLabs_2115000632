import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a variable to store an array of 10 elements of type double
        double[] numbers = new double[10];
        // Variable to store the total
        double total = 0.0;
        // Index variable initialized to 0
        int index = 0;
        // Infinite while loop
        while (true) {
            // Take the user entry
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();
            // Check if the user entered 0 or a negative number
            if (input <= 0 || index == 10) {
                break;
            }
            // Store the input number in the array
            numbers[index] = input;
            // Increment the index value
            index++;
        }
        // Calculate the sum of all numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        // Display all the numbers and the total value
        System.out.println("The entered numbers are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nThe sum of all numbers is: " + total);
        scanner.close();
    }
}

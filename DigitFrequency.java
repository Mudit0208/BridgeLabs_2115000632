import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();  // We use long to handle larger numbers
        String numString = String.valueOf(number);  // Convert the number to string to extract digits easily
        // Frequency array to store frequency of each digit (0 to 9)
        int[] frequency = new int[10];
        // Loop through each digit of the number
        for (int i = 0; i < numString.length(); i++) {
            char digitChar = numString.charAt(i);  // Get the current digit as a char
            int digit = digitChar - '0';  // Convert char to int (e.g., '5' to 5)
            frequency[digit]++;  // Increment the frequency of the digit
        }
        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
        scanner.close();
    }
}

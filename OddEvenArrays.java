import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get an integer input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }
        // Create integer arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        // Create index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;
        // Loop from 1 to the number
        for (int i = 1; i <= number; i++) {
            // Save the odd or even number into the corresponding array
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}

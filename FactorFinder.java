import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take the input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        // Loop through the numbers from 1 to the number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add the factor to the array
                factors[index] = i;
                index++;
                // If the array is full, create a larger array
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
            }
        }
        // Display the factors of the number
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}

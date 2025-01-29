import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        // Call the method to generate and print the Fibonacci sequence
        generateFibonacci(numberOfTerms);

        scanner.close();
    }

    // Method to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Sequence up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}

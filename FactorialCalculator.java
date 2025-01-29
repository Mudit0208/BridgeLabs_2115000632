import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Get input from the user
        int number = getInput();

        // Calculate the factorial using recursion
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }

    // Function to get input from the user
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    // Recursive function to calculate the factorial of a number
    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }
}

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Print numbers before swapping
        System.out.println("Before swapping: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);

        // Swap the numbers using a temporary variable
        double temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // Print numbers after swapping
        System.out.println("After swapping: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);

        scanner.close();
    }
}

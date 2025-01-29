import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        // Take input from the user
        int[] numbers = takeInput();

        // Calculate the GCD and LCM
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);

        // Display the results
        displayResult(numbers[0], numbers[1], gcd, lcm);
    }

    // Function to take input from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextInt();

        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextInt();

        scanner.close();
        return numbers;
    }

    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Function to calculate the LCM of two numbers
    public static int calculateLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;
    }

    // Function to display the results
    public static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}

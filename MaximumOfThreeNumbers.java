import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        // Take input from the user
        int[] numbers = takeInput();

        // Find the maximum of the three numbers
        int maxNumber = findMax(numbers[0], numbers[1], numbers[2]);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + maxNumber);
    }

    // Method to take input from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextInt();

        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextInt();

        System.out.print("Enter the third number: ");
        numbers[2] = scanner.nextInt();

        scanner.close();
        return numbers;
    }

    // Method to find the maximum of three numbers
    public static int findMax(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}

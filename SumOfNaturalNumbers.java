import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {
            // Calculate the sum using the formula
            int sumFormula = number * (number + 1) / 2;

            // Calculate the sum using a while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= number) {
                sumWhileLoop += i;
                i++;
            }

            // Compare the results
            if (sumFormula == sumWhileLoop) {
                System.out.println("Both computations are correct.");
                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Sum using while loop: " + sumWhileLoop);
            } else {
                System.out.println("There is a discrepancy between the two computations.");
                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Sum using while loop: " + sumWhileLoop);
            }
        } else {
            // Indicate that the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        scanner.close();
    }
}

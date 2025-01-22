import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side length of the square
        double sideLength = perimeter / 4;

        // Print the result
        System.out.println("The side length of the square is " + sideLength);

        scanner.close();
    }
}

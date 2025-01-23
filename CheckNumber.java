import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        scanner.close();
    }
}

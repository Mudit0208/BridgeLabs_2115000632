import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        // Initialize greatestFactor to 1
        int greatestFactor = 1;
        // Loop from number - 1 to 1
        for (int i = number - 1; i > 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);
        scanner.close();
    }
}

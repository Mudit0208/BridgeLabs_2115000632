import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get an integer input for the number variable
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        // Use a loop to iterate until number is not equal to 0
        while (number != 0) {
            // Remove the last digit from number
            number /= 10;
            // Increase count by 1
            count++;
        }
        // Display the count to show the number of digits
        System.out.println("The number of digits is: " + count);
        scanner.close();
    }
}

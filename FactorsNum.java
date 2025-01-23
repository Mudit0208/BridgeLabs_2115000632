import java.util.Scanner;
public class FactorsNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the input value for number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                // Print the value of i
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

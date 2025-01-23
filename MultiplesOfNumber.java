import java.util.Scanner;
public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Run a for loop backward: from i = 100 to i = 1
        for (int i = 100; i > 0; i--) {
            // Check if i perfectly divides the number
            if (i % number == 0) {
                // Print the multiple
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;
public class FizzBuzzUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        // Check if the number is positive
        if (number > 0) {
            int i = 0;
            // Loop from 0 to the entered number using a while loop
            while (i <= number) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}

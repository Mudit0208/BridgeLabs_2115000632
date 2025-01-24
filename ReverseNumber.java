import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display the elements of the array in reverse order
        System.out.print("The number in reverse order is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        scanner.close();
    }
}

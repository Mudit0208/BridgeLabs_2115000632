import java.util.Scanner;
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take integer input and store it in the variable number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Define an integer array to store the multiplication result
        int[] multiplicationResult = new int[4];
        // Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        // Display the result from the array in the format number * i = ___
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        scanner.close();
    }
}

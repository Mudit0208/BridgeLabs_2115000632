import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        // Get user input to store in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Loop through the array and check the conditions
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print("The number " + numbers[i] + " is positive and ");
                if (numbers[i] % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number " + numbers[i] + " is zero.");
            }
        }
        // Compare the first and last elements of the array
        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
        scanner.close();
    }
}

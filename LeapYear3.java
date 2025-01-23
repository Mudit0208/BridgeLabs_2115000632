import java.util.Scanner;
public class LeapYear3 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Ask the user to input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        // Check if the year is a leap year using a single if condition with logical operators
        if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        // Close the scanner
        scanner.close();
    }
}

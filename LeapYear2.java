import java.util.Scanner;
public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        // Check if the year is >= 1582
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The LeapYear program only works for year >= 1582.");
        }
        scanner.close();
    }
}

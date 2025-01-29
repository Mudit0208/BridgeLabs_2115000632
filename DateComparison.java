import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate firstDate = null;
        LocalDate secondDate = null;

        // Input and parse the first date with error handling
        while (firstDate == null) {
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String firstDateString = scanner.nextLine();
            try {
                firstDate = LocalDate.parse(firstDateString, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            }
        }

        // Input and parse the second date with error handling
        while (secondDate == null) {
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String secondDateString = scanner.nextLine();
            try {
                secondDate = LocalDate.parse(secondDateString, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            }
        }

        // Compare the dates and display the result
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }

        scanner.close();
    }
}

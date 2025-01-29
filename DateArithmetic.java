import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the result
        LocalDate finalDate = newDate.minusWeeks(3);

        // Display the final date
        System.out.println("Original date: " + date);
        System.out.println("Final date after arithmetic operations: " + finalDate);

        scanner.close();
    }
}

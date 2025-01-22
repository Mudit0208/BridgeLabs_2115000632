import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the salary
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        // Prompt user to enter the bonus
        System.out.print("Enter the bonus: ");
        double bonus = scanner.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The total income is: INR " + totalIncome);

        scanner.close();
    }
}

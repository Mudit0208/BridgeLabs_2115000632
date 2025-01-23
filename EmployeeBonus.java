import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the salary
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        // Prompt user to enter the years of service
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the years of service is more than 5 years
        if (yearsOfService > 5) {
            // Calculate the bonus amount
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with less than or equal to 5 years of service.");
        }

        scanner.close();
    }
}

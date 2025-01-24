import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define arrays to save salaries and years of service
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        // Define arrays to save new salaries and bonus amounts
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        // Variables to save the total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();
            // Check for invalid input
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter valid salary and years of service.");
                i--; // Decrement index to re-enter the data
                continue;
            }
            // Save the salary and years of service
            salaries[i] = salary;
            yearsOfService[i] = years;
        }
        // Loop to calculate the bonus, new salary, total bonus, and total salaries
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05;
            } else {
                bonus = salaries[i] * 0.02;
            }
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        // Print the results
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
        scanner.close();
    }
}

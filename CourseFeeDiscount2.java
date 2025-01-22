import java.util.Scanner;

public class CourseFeeDiscount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the original fee
        System.out.print("Enter the original fee of the course (INR): ");
        double originalFee = scanner.nextDouble();

        // Prompt user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate the discounted amount
        double discountAmount = originalFee * (discountPercentage / 100);

        // Calculate the final price after the discount
        double discountedPrice = originalFee - discountAmount;

        // Print the results
        System.out.println("The discounted amount is: INR " + discountAmount);
        System.out.println("The discounted price the student will pay is: INR " + discountedPrice);
        
        scanner.close();
    }
}

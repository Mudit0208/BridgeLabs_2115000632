import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the unit price of the item
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();

        // Prompt user to enter the quantity to be bought
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Print the result
        System.out.println("The total price is: INR " + totalPrice);

        scanner.close();
    }
}

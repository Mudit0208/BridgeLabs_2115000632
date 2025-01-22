import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int chocolates = scanner.nextInt();

        // Prompt user to enter the number of children
        System.out.print("Enter the number of children: ");
        int children = scanner.nextInt();

        // Calculate the number of chocolates each child will get
        int chocolatesPerChild = chocolates / children;

        // Calculate the remaining chocolates
        int remainingChocolates = chocolates % children;

        // Print the results
        System.out.println("Each child will get " + chocolatesPerChild + " chocolates.");
        System.out.println("Remaining chocolates: " + remainingChocolates);

        scanner.close();
    }
}

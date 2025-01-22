import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter double values for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = scanner.nextDouble();

        // Calculate the operations
        double result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c; // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b; // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c; // Modulus (%) has higher precedence than addition (+)

        // Print the results
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}

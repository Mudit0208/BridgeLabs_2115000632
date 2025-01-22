import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter values for a, b, and c
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        // Calculate the operations
        int result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c; // Multiplication (*) has higher precedence than addition (+)
        int result3 = c + a / b; // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c; // Modulus (%) has higher precedence than addition (+)

        // Print the results
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}

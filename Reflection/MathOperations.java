import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            MathOperations mathOperations = new MathOperations();

            System.out.print("Enter the operation (add, subtract, multiply): ");
            String operation = scanner.nextLine();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get the class object
            Class<?> clazz = mathOperations.getClass();

            // Get the method corresponding to user input
            Method method = clazz.getMethod(operation, int.class, int.class);

            // Dynamically invoke the method
            int result = (int) method.invoke(mathOperations, num1, num2);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
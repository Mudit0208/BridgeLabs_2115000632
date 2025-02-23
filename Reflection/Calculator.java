import java.lang.reflect.Method;

public class Calculator {

    private int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();

            Class<?> clazz = calculator.getClass();
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Allow access to private method

            // Invoke the private method
            int result = (int) multiplyMethod.invoke(calculator, 5, 4);
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

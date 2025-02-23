import java.lang.reflect.Method;

public class MethodExecutionTiming {

    public static void measureExecutionTime(Object object, String methodName, Class<?>[] parameterTypes, Object[] args) {
        try {
            Method method = object.getClass().getMethod(methodName, parameterTypes);

            long startTime = System.nanoTime();
            method.invoke(object, args);
            long endTime = System.nanoTime();

            long duration = endTime - startTime;
            System.out.println("Execution time of " + methodName + ": " + duration + " nanoseconds");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();

        measureExecutionTime(example, "performAction", new Class<?>[]{}, new Object[]{});
    }
}

class ExampleClass {
    public void performAction() {
        try {
            Thread.sleep(500);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

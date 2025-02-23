import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {
}

public class PerformanceTracker {

    @LogExecutionTime
    public void methodOne() {
        try {
            Thread.sleep(500);  // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogExecutionTime
    public void methodTwo() {
        try {
            Thread.sleep(1000);  // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        PerformanceTracker tracker = new PerformanceTracker();
        Method[] methods = tracker.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(tracker);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println("Execution time of " + method.getName() + ": " + duration + " nanoseconds");
            }
        }
    }
}

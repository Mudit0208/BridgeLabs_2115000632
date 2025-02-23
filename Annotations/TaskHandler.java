import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

public class TaskHandler {

    @ImportantMethod(level = "HIGH")
    public void processCriticalTask() {
        System.out.println("Processing critical task...");
    }

    @ImportantMethod(level = "LOW")
    public void processLowPriorityTask() {
        System.out.println("Processing low priority task...");
    }

    public static void main(String[] args) throws Exception {
        TaskHandler handler = new TaskHandler();
        Method[] methods = handler.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
            }
        }
    }
}

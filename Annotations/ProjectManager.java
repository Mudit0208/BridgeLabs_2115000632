import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

public class ProjectManager {

    @Todo(task = "Implement user login functionality", assignedTo = "Alice", priority = "HIGH")
    public void userLogin() {
        System.out.println("User login functionality.");
    }

    @Todo(task = "Create database schema", assignedTo = "Bob")
    public void createDatabaseSchema() {
        System.out.println("Database schema creation.");
    }

    @Todo(task = "Set up unit tests", assignedTo = "Charlie", priority = "LOW")
    public void setUpUnitTests() {
        System.out.println("Setting up unit tests.");
    }

    public static void main(String[] args) throws Exception {
        ProjectManager manager = new ProjectManager();
        Method[] methods = manager.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned to: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}

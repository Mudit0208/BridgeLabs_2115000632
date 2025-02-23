import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "John")
    public void performTask() {
        System.out.println("Task is being performed.");
    }

    public static void main(String[] args) throws Exception {
        TaskManager manager = new TaskManager();
        Method method = manager.getClass().getMethod("performTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned to: " + taskInfo.assignedTo());
        }
    }
}

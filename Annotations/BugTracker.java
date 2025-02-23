import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

public class BugTracker {

    @BugReport(description = "Null pointer exception in method X")
    @BugReport(description = "Array index out of bounds exception in method Y")
    public void processTask() {
        System.out.println("Processing task...");
    }

    public static void main(String[] args) throws Exception {
        BugTracker tracker = new BugTracker();
        Method method = tracker.getClass().getMethod("processTask");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bugReport : bugReports.value()) {
                System.out.println("Bug Report: " + bugReport.description());
            }
        }
    }
}

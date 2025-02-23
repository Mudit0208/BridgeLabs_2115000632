import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

public class RoleBasedAccessControl {

    private String currentUserRole;

    public RoleBasedAccessControl(String currentUserRole) {
        this.currentUserRole = currentUserRole;
    }

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Executing admin task...");
    }

    public void checkAccess(Method method) {
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (!roleAllowed.value().equals(currentUserRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        try {
            method.invoke(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        RoleBasedAccessControl adminAccess = new RoleBasedAccessControl("ADMIN");
        RoleBasedAccessControl userAccess = new RoleBasedAccessControl("USER");

        Method adminTaskMethod = adminAccess.getClass().getMethod("adminTask");

        System.out.println("Admin trying to access:");
        adminAccess.checkAccess(adminTaskMethod);  // Should be allowed

        System.out.println("User trying to access:");
        userAccess.checkAccess(adminTaskMethod);  // Should be denied
    }
}

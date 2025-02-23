import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

class DatabaseService {
    public void connect() {
        System.out.println("Connecting to the database...");
    }
}

class UserService {
    @Inject
    private DatabaseService databaseService;

    public void performAction() {
        databaseService.connect();
        System.out.println("Performing user service action.");
    }
}

class DIContainer {
    private final Map<Class<?>, Object> services = new HashMap<>();

    public <T> void registerService(Class<T> serviceClass) throws Exception {
        Constructor<T> constructor = serviceClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        T serviceInstance = constructor.newInstance();
        services.put(serviceClass, serviceInstance);
    }

    public <T> T getService(Class<T> serviceClass) {
        return (T) services.get(serviceClass);
    }

    public void injectDependencies(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = getService(field.getType());
                field.set(object, dependency);
            }
        }
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) throws Exception {
        DIContainer diContainer = new DIContainer();

        diContainer.registerService(DatabaseService.class);
        diContainer.registerService(UserService.class);

        UserService userService = diContainer.getService(UserService.class);

        diContainer.injectDependencies(userService);

        userService.performAction();
    }
}

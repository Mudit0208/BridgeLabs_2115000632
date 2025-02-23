import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}

class LoggingProxy implements InvocationHandler {

    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method called: " + method.getName());
        return method.invoke(target, args);
    }

    public static Object newProxyInstance(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggingProxy(target)
        );
    }
}

public class CustomLoggingProxyExample {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();

        // Create a proxy for the Greeting interface
        Greeting proxyGreeting = (Greeting) LoggingProxy.newProxyInstance(greeting);

        // Call method on the proxy object, which logs the method name
        proxyGreeting.sayHello();
    }
}

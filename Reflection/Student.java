import java.lang.reflect.Constructor;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Student");
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

            // Dynamically create an instance
            Object studentInstance = constructor.newInstance("John Doe", 20);

            // Invoke the display method
            studentInstance.getClass().getMethod("display").invoke(studentInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

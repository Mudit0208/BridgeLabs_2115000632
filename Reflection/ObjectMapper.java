import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T object = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object value = entry.getValue();

                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // Allow access to private fields
                field.set(object, value); // Set the field value
            }

            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", 30
        );

        // Assuming a class Person with fields name and age
        Personn person = toObject(Personn.class, properties);

        if (person != null) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }
}

class Personn {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

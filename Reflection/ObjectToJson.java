import java.lang.reflect.Field;

public class ObjectToJson {

    public static String toJson(Object object) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        try {
            Class<?> clazz = object.getClass();
            Field[] fields = clazz.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true); // Allow access to private fields
                Object value = field.get(object);

                jsonBuilder.append("\"").append(field.getName()).append("\": ");
                if (value instanceof String) {
                    jsonBuilder.append("\"").append(value).append("\"");
                } else {
                    jsonBuilder.append(value);
                }

                if (i < fields.length - 1) {
                    jsonBuilder.append(", ");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        String jsonRepresentation = toJson(person);
        System.out.println(jsonRepresentation);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

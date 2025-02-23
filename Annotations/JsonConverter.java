import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}

public class JsonConverter {

    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                if (!first) {
                    json.append(", ");
                }
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                json.append("\"").append(jsonField.name()).append("\": \"").append(field.get(obj)).append("\"");
                first = false;
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        User user = new User("john_doe", 25);
        try {
            String json = toJson(user);
            System.out.println(json);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

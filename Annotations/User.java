import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > getMaxLength()) {
            throw new IllegalArgumentException("Username exceeds maximum length of " + getMaxLength());
        }
        this.username = username;
    }

    private int getMaxLength() {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);
            return maxLength.value();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return Integer.MAX_VALUE;
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        try {
            User user = new User("JohnDoe123");
            System.out.println("User created with username: " + user.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user = new User("Short");
            System.out.println("User created with username: " + user.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

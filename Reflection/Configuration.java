import java.lang.reflect.Field;

public class Configuration {

    private static String API_KEY = "default-api-key";

    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> clazz = Configuration.class;

            // Access the private static field API_KEY
            Field apiKeyField = clazz.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true); // Allow access to private field

            // Print original API_KEY value
            System.out.println("Original API_KEY: " + apiKeyField.get(null));

            // Modify the static field value
            apiKeyField.set(null, "new-api-key");

            // Print the modified API_KEY value
            System.out.println("Modified API_KEY: " + apiKeyField.get(null));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

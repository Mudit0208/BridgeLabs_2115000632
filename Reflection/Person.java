import java.lang.reflect.Field;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            Class<?> clazz = person.getClass();
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true); // Allow access to private field

            System.out.println("Original age: " + ageField.get(person));

            // Modify the private field
            ageField.set(person, 30);
            System.out.println("Modified age: " + ageField.get(person));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

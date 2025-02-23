import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "John Doe")
public class Book {

    public void displayBook() {
        System.out.println("This is a book.");
    }

    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> clazz = Book.class;

            // Check if the Author annotation is present
            if (clazz.isAnnotationPresent(Author.class)) {
                // Retrieve the annotation
                Author authorAnnotation = clazz.getAnnotation(Author.class);
                System.out.println("Author: " + authorAnnotation.name());
            } else {
                System.out.println("No Author annotation found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

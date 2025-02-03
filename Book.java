public class Book {
    // Static variable (shared among all books)
    private static String libraryName = "Hindu Wisdom Library";

    // Final variable (cannot be changed once assigned)
    private final String isbn;
    private String title;
    private String author;

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Constructor
    public Book(String isbn, String title, String author) {
        this.isbn = isbn; // Using 'this' to resolve ambiguity
        this.title = title; // Using 'this' to resolve ambiguity
        this.author = author; // Using 'this' to resolve ambiguity
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Instance method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Display the library name
        Book.displayLibraryName();

        // Create Book objects
        Book book1 = new Book("1234567890", "Bhagavad Gita", "Vyasa");
        Book book2 = new Book("0987654321", "Ramayana", "Valmiki");

        // Check if objects are instances of Book class
        if (book1 instanceof Book) {
            System.out.println("\n=== Book 1 ===");
            book1.displayBookDetails();
        }

        if (book2 instanceof Book) {
            System.out.println("\n=== Book 2 ===");
            book2.displayBookDetails();
        }
    }
}

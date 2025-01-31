public class Main_Book {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("1984", "George Orwell", 8.99);

        // Display details of each book
        System.out.println("=== Book 1 ===");
        book1.displayDetails();
        System.out.println("\n=== Book 2 ===");
        book2.displayDetails();
    }
}

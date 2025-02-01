public class Main_Book {
    public static void main(String[] args) {
        // Create Book objects using default constructor
        Book defaultBook = new Book("Shrimad Bhagwat Geeta", "Shri Krishn", 50);

        // Create Book objects using parameterized constructor
        Book parameterizedBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);

        // Display details of each book
        System.out.println("=== Default Book ===");
        defaultBook.displayDetails();
        System.out.println("\n=== Parameterized Book ===");
        parameterizedBook.displayDetails();
    }
}

public class Main_LibraryBookSystem {
    public static void main(String[] args) {
        // Create LibraryBookSystem objects using parameterized constructor for Hindu ancient holy books
        LibraryBookSystem book1 = new LibraryBookSystem("Bhagavad Gita", "Vyasa", 15.99, true);
        LibraryBookSystem book2 = new LibraryBookSystem("Rigveda", "Vyasa", 20.99, true);
        LibraryBookSystem book3 = new LibraryBookSystem("Upanishads", "Various Authors", 18.99, true);
        LibraryBookSystem book4 = new LibraryBookSystem("Ramayana", "Valmiki", 22.99, true);
        LibraryBookSystem book5 = new LibraryBookSystem("Mahabharata", "Vyasa", 25.99, true);

        // Display details of each book
        System.out.println("=== Book 1 ===");
        book1.displayDetails();
        System.out.println("\n=== Book 2 ===");
        book2.displayDetails();
        System.out.println("\n=== Book 3 ===");
        book3.displayDetails();
        System.out.println("\n=== Book 4 ===");
        book4.displayDetails();
        System.out.println("\n=== Book 5 ===");
        book5.displayDetails();

        // Attempt to borrow books
        System.out.println("\nBorrowing Book 1:");
        book1.borrowBook();
        System.out.println("\nBorrowing Book 2:");
        book2.borrowBook();
        System.out.println("\nBorrowing Book 3:");
        book3.borrowBook();
        System.out.println("\nBorrowing Book 4:");
        book4.borrowBook();
        System.out.println("\nBorrowing Book 5:");
        book5.borrowBook();

        // Display details again to see changes in availability
        System.out.println("\n=== Book 1 ===");
        book1.displayDetails();
        System.out.println("\n=== Book 2 ===");
        book2.displayDetails();
        System.out.println("\n=== Book 3 ===");
        book3.displayDetails();
        System.out.println("\n=== Book 4 ===");
        book4.displayDetails();
        System.out.println("\n=== Book 5 ===");
        book5.displayDetails();
    }
}

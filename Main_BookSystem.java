public class Main_BookSystem {
    public static void main(String[] args) {
        // Create BookSystem objects for Hindu holy books
        BookSystem book1 = new BookSystem("1234567890", "Bhagavad Gita", "Vyasa");
        BookSystem book2 = new BookSystem("0987654321", "Ramayana", "Valmiki");

        // Display details of each book
        System.out.println("=== Book 1 ===");
        book1.displayBookDetails();
        System.out.println("\n=== Book 2 ===");
        book2.displayBookDetails();

        // Create EBook objects for Hindu holy books
        EBook ebook1 = new EBook("1122334455", "Upanishads", "Various Authors", "PDF");
        EBook ebook2 = new EBook("5544332211", "Vedas", "Vyasa", "EPUB");

        // Display details of each eBook
        System.out.println("\n=== EBook 1 ===");
        ebook1.displayEBookDetails();
        System.out.println("\n=== EBook 2 ===");
        ebook2.displayEBookDetails();
    }
}

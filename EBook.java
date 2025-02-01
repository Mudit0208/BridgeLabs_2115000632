public class EBook extends BookSystem {
    // Instance variable for eBook format
    private String format;

    // Constructor
    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("Format: " + format);
    }
}

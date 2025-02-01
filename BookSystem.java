public class BookSystem {
    // Instance variables
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public BookSystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to get the author name
    public String getAuthor() {
        return author;
    }

    // Method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

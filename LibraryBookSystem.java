public class LibraryBookSystem {
    // Fields (Attributes)
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public LibraryBookSystem() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
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

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to borrow the book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
            return true;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
            return false;
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

import java.util.ArrayList;

// Book class definition
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Library class definition
class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main class to demonstrate aggregation
public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2); // Book can exist in multiple libraries
        library2.addBook(book3);

        // Display books in libraries
        System.out.println("Library 1 books:");
        library1.showBooks();

        System.out.println("\nLibrary 2 books:");
        library2.showBooks();
    }
}

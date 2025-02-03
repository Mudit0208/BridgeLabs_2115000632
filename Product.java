public class Product {
    // Static variable (shared among all products)
    private static double discount = 10.0; // Default discount percentage

    // Final variable (cannot be changed once assigned)
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Constructor
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID; // Using 'this' to resolve ambiguity
        this.productName = productName; // Using 'this' to resolve ambiguity
        this.price = price; // Using 'this' to resolve ambiguity
        this.quantity = quantity; // Using 'this' to resolve ambiguity
    }

    // Getter for productID
    public String getProductID() {
        return productID;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("P001", "Laptop", 60000.0, 2);
        Product product2 = new Product("P002", "Smartphone", 30000.0, 3);

        // Display product details before updating discount
        System.out.println("=== Product 1 ===");
        product1.displayProductDetails();
        System.out.println("\n=== Product 2 ===");
        product2.displayProductDetails();

        // Update the discount percentage
        Product.updateDiscount(15.0);

        // Display product details after updating discount
        System.out.println("\n=== Updated Discount ===");
        System.out.println("=== Product 1 ===");
        product1.displayProductDetails();
        System.out.println("\n=== Product 2 ===");
        product2.displayProductDetails();
    }
}

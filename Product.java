public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all products)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment the total number of products created
    }

    // Instance method to display the details of a product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to show the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
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
}

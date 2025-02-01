public class Main_Product {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 699.99);
        Product product3 = new Product("Tablet", 399.99);

        // Display details of each product
        System.out.println("=== Product 1 ===");
        product1.displayProductDetails();
        System.out.println("\n=== Product 2 ===");
        product2.displayProductDetails();
        System.out.println("\n=== Product 3 ===");
        product3.displayProductDetails();

        // Display the total number of products created
        System.out.println("\n=== Total Products ===");
        Product.displayTotalProducts();
    }
}

import java.util.List;
import java.util.ArrayList;

// Product class
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // String representation of Product
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Customer class
class Customer {
    private String name;
    private String email;
    private List<Order> orders;  // A customer can have multiple orders

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // String representation of Customer
    @Override
    public String toString() {
        return name + " (" + email + ")";
    }

    // List orders of the customer
    public List<Order> getOrders() {
        return orders;
    }
}

// Order class
class Order {
    private Customer customer;  // The customer who placed the order
    private List<Product> products;  // A list of products in the order

    // Constructor
    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Method to add product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculate total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Getter methods
    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    // String representation of Order
    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order by " + customer.getName() + ":\n");
        for (Product product : products) {
            orderDetails.append("- ").append(product).append("\n");
        }
        orderDetails.append("Total: $" + calculateTotal());
        return orderDetails.toString();
    }
}

// Main class to test the system
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 599.99);
        Product product3 = new Product("Headphones", 199.99);

        // Create a customer
        Customer customer = new Customer("Mudit", "mudit@example.com");

        // Create an order and add products to it
        Order order1 = new Order(customer);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places the order
        customer.placeOrder(order1);

        // Create another order and add a product to it
        Order order2 = new Order(customer);
        order2.addProduct(product3);

        // Customer places the second order
        customer.placeOrder(order2);

        // Display customer orders
        System.out.println("Orders placed by " + customer.getName() + ":");
        for (Order order : customer.getOrders()) {
            System.out.println(order);
            System.out.println("------");
        }
    }
}

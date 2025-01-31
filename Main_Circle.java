public class Main_Circle {
    public static void main(String[] args) {
        // Create Circle objects
        Circle circle1 = new Circle(11.0);
        Circle circle2 = new Circle(13.0);

        // Display details of each circle
        System.out.println("=== Circle 1 ===");
        circle1.displayDetails();
        System.out.println("\n=== Circle 2 ===");
        circle2.displayDetails();
    }
}

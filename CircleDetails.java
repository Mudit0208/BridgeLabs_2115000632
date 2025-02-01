public class CircleDetails {
    // Field (Attribute)
    private double radius;

    // Default constructor
    public CircleDetails() {
        this(1.0); // Calls the parameterized constructor with a default value
    }

    // Parameterized constructor
    public CircleDetails(double radius) {
        this.radius = radius;
    }

    // Method to display the radius
    public void displayRadius() {
        System.out.println("Circle Radius: " + radius);
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the details of the circle
    public void displayDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + calculateArea());
        System.out.println("Circle Circumference: " + calculateCircumference());
    }
}

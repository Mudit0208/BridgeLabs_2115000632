public class Circle {
    // Field (Attribute)
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
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

public class Person {
    // Fields (Attributes)
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

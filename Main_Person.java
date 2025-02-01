public class Main_Person {
    public static void main(String[] args) {
        // Create a Person object using the parameterized constructor
        Person person1 = new Person("Chinnappa", 30, "123 Main St");

        // Create a Person object using the copy constructor
        Person person2 = new Person(person1);

        // Display details of the original and copied Person objects
        System.out.println("=== Person 1 ===");
        person1.displayDetails();
        System.out.println("\n=== Person 2 (Copy of Person 1) ===");
        person2.displayDetails();
    }
}

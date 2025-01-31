public class Main_Employee {
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee("Mudit", 101, 450000.0);
        Employee employee2 = new Employee("Nikhil", 102, 550000.0);

        // Display details of each employee
        System.out.println("=== Employee 1 ===");
        employee1.displayDetails();
        System.out.println("\n=== Employee 2 ===");
        employee2.displayDetails();
    }
}

public class Main_Employee {
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee(101, "Engineering", 60000.0);
        Employee employee2 = new Employee(102, "Marketing", 55000.0);

        // Display details of each employee
        System.out.println("=== Employee 1 ===");
        employee1.displayEmployeeDetails();
        System.out.println("\n=== Employee 2 ===");
        employee2.displayEmployeeDetails();

        // Modify salary of employee1
        employee1.setSalary(65000.0);
        System.out.println("\n=== Updated Employee 1 ===");
        employee1.displayEmployeeDetails();

        // Create Manager objects
        Manager manager1 = new Manager(201, "Engineering", 80000.0, 5);
        Manager manager2 = new Manager(202, "Marketing", 75000.0, 3);

        // Display details of each manager
        System.out.println("\n=== Manager 1 ===");
        manager1.displayManagerDetails();
        System.out.println("\n=== Manager 2 ===");
        manager2.displayManagerDetails();
    }
}

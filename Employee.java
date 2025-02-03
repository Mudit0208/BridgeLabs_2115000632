public class Employee {
    // Static variable (shared among all employees)
    private static String companyName = "Vedic Technologies Pvt. Ltd.";
    private static int totalEmployees = 0;

    // Final variable (cannot be changed once assigned)
    private final int id;
    private String name;
    private String designation;

    // Constructor
    public Employee(int id, String name, String designation) {
        this.id = id; // Using 'this' to resolve ambiguity
        this.name = name; // Using 'this' to resolve ambiguity
        this.designation = designation; // Using 'this' to resolve ambiguity
        totalEmployees++; // Increment the total number of employees
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for designation
    public String getDesignation() {
        return designation;
    }

    // Setter for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Static method to change company name
    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee(101, "Arjun Sharma", "Software Engineer");
        Employee employee2 = new Employee(102, "Lakshmi Iyer", "Marketing Manager");

        // Display the total number of employees
        Employee.displayTotalEmployees();

        // Check if objects are instances of Employee class
        if (employee1 instanceof Employee) {
            System.out.println("\n=== Employee 1 ===");
            employee1.displayEmployeeDetails();
        }

        if (employee2 instanceof Employee) {
            System.out.println("\n=== Employee 2 ===");
            employee2.displayEmployeeDetails();
        }

        // Display the total number of employees after creating objects
        Employee.displayTotalEmployees();
    }
}

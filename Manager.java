public class Manager extends Employee {
    // Instance variable for manager's team size
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

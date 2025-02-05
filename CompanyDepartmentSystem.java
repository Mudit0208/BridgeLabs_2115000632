import java.util.ArrayList;
import java.util.List;

// Employee Class (Represents an employee within a department)
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', role='" + role + "'}";
    }
}

// Department Class (Represents a department within the company)
class Department {
    private String departmentName;
    private List<Employee> employees;  // List of employees in the department

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Getter method for department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Method to add an employee to the department
    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    // Method to list all employees in the department
    public void listEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

// Company Class (Represents a company with multiple departments)
class Company {
    private String companyName;
    private List<Department> departments;  // List of departments in the company

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Method to get a department by name
    public Department getDepartment(String departmentName) {
        for (Department department : departments) {
            if (department.getDepartmentName().equals(departmentName)) {
                return department;
            }
        }
        return null;  // If department doesn't exist
    }

    // Method to list all departments and their employees
    public void listDepartmentsAndEmployees() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.listEmployees();
        }
    }

    // Cleanup (When company is deleted, all departments and employees will also be deleted)
    public void deleteCompany() {
        departments.clear();
        System.out.println("All departments and employees deleted for company: " + companyName);
    }
}

// Main class to demonstrate composition
public class CompanyDepartmentSystem {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp");

        // Add departments to the company
        company.addDepartment("HR");
        company.addDepartment("IT");

        // Add employees to the departments
        company.getDepartment("HR").addEmployee("John", "Manager");
        company.getDepartment("HR").addEmployee("Alice", "HR Specialist");
        company.getDepartment("IT").addEmployee("Bob", "Developer");
        company.getDepartment("IT").addEmployee("Eve", "System Administrator");

        // List all departments and their employees
        company.listDepartmentsAndEmployees();

        // Delete the company (which will also delete all departments and employees)
        company.deleteCompany();
    }
}
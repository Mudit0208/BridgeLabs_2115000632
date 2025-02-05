import java.util.ArrayList;
import java.util.List;

// Faculty Class (Represents a faculty member)
class Faculty {
    private String name;
    private String designation;

    public Faculty(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return name + " (" + designation + ")";
    }
}

// Department Class (Represents a department in the university)
class Department {
    private String departmentName;
    private List<Faculty> faculties;  // Aggregation: Faculty can exist outside the department

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    // Method to add a faculty to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to list all faculties in the department
    public void listFaculties() {
        System.out.println("Department: " + departmentName);
        for (Faculty faculty : faculties) {
            System.out.println(faculty);
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

// University Class (Represents the university with multiple departments)
class University {
    private String universityName;
    private List<Department> departments;  // Composition: Deleting university deletes departments

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to list all departments in the university
    public void listDepartments() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.listFaculties();
        }
    }

    // Cleanup (Deleting the university will delete all departments)
    public void deleteUniversity() {
        departments.clear();
        System.out.println("All departments deleted for university: " + universityName);
    }
}

// Main class to demonstrate the university, departments, and faculty system
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Global University");

        // Create departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");

        // Create faculty members (Faculty can exist independently of a department)
        Faculty faculty1 = new Faculty("Dr. Aryan", "Professor");
        Faculty faculty2 = new Faculty("Dr. Sanya", "Assistant Professor");
        Faculty faculty3 = new Faculty("Dr. Raj", "Lecturer");

        // Add faculty to departments (Faculty can be added to different departments)
        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);
        department2.addFaculty(faculty3);

        // Add departments to the university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // List all departments and faculties in the university
        university.listDepartments();

        // Delete the university (which deletes all departments)
        university.deleteUniversity();

        // Trying to list departments after deleting the university (no departments should remain)
        university.listDepartments();
    }
}

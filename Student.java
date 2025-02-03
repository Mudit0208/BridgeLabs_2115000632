public class Student {
    // Static variable (shared among all students)
    private static String universityName = "Hindu University of Vedic Sciences";
    private static int totalStudents = 0;

    // Final variable (cannot be changed once assigned)
    private final int rollNumber;
    private String name;
    private double grade;

    // Constructor
    public Student(int rollNumber, String name, double grade) {
        this.rollNumber = rollNumber; // Using 'this' to resolve ambiguity
        this.name = name; // Using 'this' to resolve ambiguity
        this.grade = grade; // Using 'this' to resolve ambiguity
        totalStudents++; // Increment the total number of students
    }

    // Getter for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public double getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Static method to display university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Instance method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Display university name
        Student.displayUniversityName();

        // Create Student objects
        Student student1 = new Student(101, "Arjun Sharma", 8.5);
        Student student2 = new Student(102, "Lakshmi Iyer", 9.0);

        // Display total number of students
        Student.displayTotalStudents();

        // Check if objects are instances of Student class
        if (student1 instanceof Student) {
            System.out.println("\n=== Student 1 ===");
            student1.displayStudentDetails();
        }

        if (student2 instanceof Student) {
            System.out.println("\n=== Student 2 ===");
            student2.displayStudentDetails();
        }

        // Display total number of students after creating objects
        Student.displayTotalStudents();
    }
}

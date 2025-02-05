import java.util.List;
import java.util.ArrayList;

// Course class
class Course {
    private String courseName;
    private String courseCode;
    private Professor professor;  // A course is taught by one professor
    private List<Student> students;  // A course can have multiple students

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    // String representation of Course
    @Override
    public String toString() {
        StringBuilder courseDetails = new StringBuilder(courseName + " (" + courseCode + ")");
        courseDetails.append("\nProfessor: " + professor.getName() + "\nEnrolled Students: ");

        if (students.isEmpty()) {
            courseDetails.append("No students enrolled.");
        } else {
            for (Student student : students) {
                courseDetails.append("\n- " + student.getName());
            }
        }

        return courseDetails.toString();
    }
}

// Professor class
class Professor {
    private String name;
    private String department;

    // Constructor
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // String representation of Professor
    @Override
    public String toString() {
        return name + " (" + department + " Department)";
    }
}

// Student class
class Student {
    private String name;
    private String studentID;
    private List<Course> courses;  // A student can enroll in multiple courses

    // Constructor
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // String representation of Student
    @Override
    public String toString() {
        StringBuilder studentDetails = new StringBuilder(name + " (" + studentID + ")\nEnrolled Courses:");
        if (courses.isEmpty()) {
            studentDetails.append(" No courses enrolled.");
        } else {
            for (Course course : courses) {
                studentDetails.append("\n- " + course.getCourseName() + " (" + course.getCourseCode() + ")");
            }
        }

        return studentDetails.toString();
    }
}

// Main class to test the system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. John Smith", "Computer Science");
        Professor professor2 = new Professor("Dr. Jane Doe", "Mathematics");

        // Create courses
        Course course1 = new Course("Data Structures", "CS101");
        Course course2 = new Course("Calculus", "MATH101");

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Create students
        Student student1 = new Student("Alice Johnson", "S12345");
        Student student2 = new Student("Bob Williams", "S67890");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display course details
        System.out.println(course1);
        System.out.println("------");
        System.out.println(course2);
        System.out.println("------");

        // Display student details
        System.out.println(student1);
        System.out.println("------");
        System.out.println(student2);
    }
}

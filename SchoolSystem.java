import java.util.ArrayList;
import java.util.List;

// Course Class (Represents a course offered by the school)
class Course {
    private String courseName;
    private List<Student> enrolledStudents;  // List of students enrolled in this course

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student in this course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to view all enrolled students
    public void listEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student Class (Represents a student in the school)
class Student {
    private String name;
    private List<Course> courses;  // List of courses the student is enrolled in

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);  // Add this student to the course
    }

    // Method to view all courses the student is enrolled in
    public void listCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// School Class (Represents a school with multiple students)
class School {
    private String schoolName;
    private List<Student> students;  // List of students in the school

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to list all students in the school
    public void listStudents() {
        System.out.println("School: " + schoolName);
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

// Main class to demonstrate the school, students, and courses system
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a School
        School school = new School("VidyaVihar School");

        // Create Students (Hindu Names)
        Student student1 = new Student("Arjun");
        Student student2 = new Student("Sita");
        Student student3 = new Student("Lakshmi");

        // Add Students to the School
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create Courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);
        student2.enrollInCourse(course3);
        student3.enrollInCourse(course2);
        student3.enrollInCourse(course3);

        // View courses for each student
        student1.listCourses();
        student2.listCourses();
        student3.listCourses();

        // View students in each course
        course1.listEnrolledStudents();
        course2.listEnrolledStudents();
        course3.listEnrolledStudents();

        // List all students in the school
        school.listStudents();
    }
}

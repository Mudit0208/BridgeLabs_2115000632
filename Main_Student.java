public class Main_Student {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student(101, "Arjun Sharma", 8.5);
        Student student2 = new Student(102, "Lakshmi Iyer", 9.0);

        // Display details of each student
        System.out.println("=== Student 1 ===");
        student1.displayStudentDetails();
        System.out.println("\n=== Student 2 ===");
        student2.displayStudentDetails();

        // Create PostgraduateStudent objects
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(201, "Ravi Kumar", 8.8, "Machine Learning in Healthcare");
        PostgraduateStudent pgStudent2 = new PostgraduateStudent(202, "Gita Rao", 9.3, "Quantum Computing Algorithms");

        // Display details of each postgraduate student
        System.out.println("\n=== Postgraduate Student 1 ===");
        pgStudent1.displayPostgraduateDetails();
        System.out.println("\n=== Postgraduate Student 2 ===");
        pgStudent2.displayPostgraduateDetails();
    }
}

import java.util.Scanner;
public class StudentGrades2 {
    // Method to get valid marks input
    public static double getValidMarks(Scanner scanner, String subjectName) {
        double marks;
        while (true) {
            System.out.print("Enter marks for " + subjectName + ": ");
            marks = scanner.nextDouble();
            if (marks < 0) {
                System.out.println("Marks cannot be negative. Please enter a valid positive number.");
            } else {
                return marks;
            }
        }
    }
    // Method to calculate the grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input number of students
        int numStudents;
        while (true) {
            System.out.print("Enter the number of students: ");
            numStudents = scanner.nextInt();
            if (numStudents <= 0) {
                System.out.println("The number of students must be positive. Please enter a valid number.");
            } else {
                break;
            }
        }
        // 2D array to store marks (3 subjects: Physics, Chemistry, Maths for each student)
        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        // Input marks for each student and calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            // Get valid marks for Physics, Chemistry, and Maths
            marks[i][0] = getValidMarks(scanner, "Physics");
            marks[i][1] = getValidMarks(scanner, "Chemistry");
            marks[i][2] = getValidMarks(scanner, "Maths");
            // Calculate total and percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            // Calculate grade based on percentage
            grades[i] = calculateGrade(percentages[i]);
        }
        // Display results
        System.out.println("\nStudent Results:");
        System.out.printf("%-10s%-10s%-10s%-10s%-15s%-5s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d%-10.2f%-10.2f%-10.2f%-15.2f%-5s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        scanner.close();
    }
}

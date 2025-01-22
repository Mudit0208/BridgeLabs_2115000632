import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);

        scanner.close();
    }
}

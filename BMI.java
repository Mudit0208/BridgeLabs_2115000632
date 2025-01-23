import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();
        // Convert height from cm to meters
        height = height / 100;
        // Calculate BMI
        double bmi = weight / (height * height);
        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        // Print the BMI and weight status
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
        scanner.close();
    }
}

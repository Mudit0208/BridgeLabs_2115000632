import java.util.Scanner;
public class BMICalculatorMultiDimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create a multi-dimensional array to store weight, height and BMI, and an array for weight status
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            double weight = scanner.nextDouble();
            // Check for negative values
            while (weight <= 0) {
                System.out.print("Please enter a positive weight for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
            }
            personData[i][0] = weight;

            System.out.print("Enter height of person " + (i + 1) + " (in meters): ");
            double height = scanner.nextDouble();
            // Check for negative values
            while (height <= 0) {
                System.out.print("Please enter a positive height for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
            }
            personData[i][1] = height;

            // Calculate BMI
            personData[i][2] = weight / (height * height);
        }

        // Find the weight status of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}

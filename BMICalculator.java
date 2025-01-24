import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store the weight, height, BMI, and weight status of the persons
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate the BMI of all the persons and find the weight status of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}

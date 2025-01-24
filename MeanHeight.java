import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a double array named heights of size 11
        double[] heights = new double[11];
        double sum = 0.0;
        // Get input values from the user
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        // Calculate the mean height
        double mean = sum / heights.length;
        // Print the mean height of the football team
        System.out.println("The mean height of the football team is: " + mean + " cm");
        scanner.close();
    }
}

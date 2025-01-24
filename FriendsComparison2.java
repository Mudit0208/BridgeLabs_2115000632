import java.util.Scanner;
public class FriendsComparison2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define arrays to store ages and heights of the 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height for the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest of the 3 friends
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
        scanner.close();
    }
}

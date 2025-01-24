import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        // Create a 2D array (Matrix) and take user input
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Create a 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;
        // Copy the elements of the matrix to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        // Display the 1D array
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}

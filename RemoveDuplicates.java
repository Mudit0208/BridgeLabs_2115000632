import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to remove duplicates and store the result
        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);
        scanner.close();
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String input) {
        boolean[] seen = new boolean[256];  // Array to track seen characters
        char[] result = new char[input.length()];
        int index = 0;

        for (char ch : input.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result[index++] = ch;
            }
        }

        return new String(result, 0, index);
    }
}
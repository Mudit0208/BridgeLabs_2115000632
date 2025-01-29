import java.util.Scanner;
import java.util.HashSet;

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
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }
}

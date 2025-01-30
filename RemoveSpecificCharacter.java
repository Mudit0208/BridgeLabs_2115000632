import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Call the method to remove the specified character and store the result
        String result = removeCharacter(input, charToRemove);

        System.out.println("Modified String: " + result);
        scanner.close();
    }

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String input, char charToRemove) {
        char[] chars = new char[input.length()];
        int index = 0;

        for (char ch : input.toCharArray()) {
            if (ch != charToRemove) {
                chars[index++] = ch;
            }
        }

        return new String(chars, 0, index);
    }
}
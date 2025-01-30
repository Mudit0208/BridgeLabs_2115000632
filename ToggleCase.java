import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to toggle case and store the result
        String toggledString = toggleCase(input);

        System.out.println("String after toggling case: " + toggledString);
        scanner.close();
    }

    // Method to toggle the case of each character in a string
    public static String toggleCase(String input) {
        char[] chars = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                chars[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                chars[i] = Character.toUpperCase(ch);
            } else {
                chars[i] = ch;
            }
        }

        return new String(chars);
    }
}
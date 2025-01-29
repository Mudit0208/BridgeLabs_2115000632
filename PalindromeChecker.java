import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Get input from the user
        String inputString = getInput();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);

        // Display the result
        displayResult(inputString, isPalindrome);
    }

    // Function to get input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    // Function to check if a given string is a palindrome
    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", ""); // Normalize the string
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}

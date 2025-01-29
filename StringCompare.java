import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the method to compare the two strings
        int result = compareStrings(str1, str2);

        // Output based on the comparison result
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\" in lexicographical order.");
        }

        scanner.close();
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }

        // If all characters are the same, compare lengths
        return len1 - len2;
    }
}

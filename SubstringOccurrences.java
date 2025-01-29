import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        // Call the method to count the occurrences of the substring
        int count = countSubstringOccurrences(inputString, substring);

        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the given string.");
        scanner.close();
    }

    // Method to count the occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }
}

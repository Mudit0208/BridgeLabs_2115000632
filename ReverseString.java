import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize variables to point to the beginning and end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Swap the characters while moving towards the middle of the array
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // Convert the character array back to a string
        String reversedString = new String(charArray);

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}

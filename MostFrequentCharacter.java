import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find the most frequent character and store the result
        char mostFrequent = findMostFrequentCharacter(input);

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        scanner.close();
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String input) {
        int[] frequency = new int[256];  // Array to store frequency of each character

        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        char mostFrequent = '\0';
        int maxFrequency = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequent = (char) i;
            }
        }

        return mostFrequent;
    }
}
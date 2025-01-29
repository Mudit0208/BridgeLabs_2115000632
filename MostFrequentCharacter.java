import java.util.HashMap;
import java.util.Map;
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
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        char mostFrequent = '\0';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}

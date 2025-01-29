public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String wordToReplace = "fox";
        String replacementWord = "cat";

        // Call the replaceWord method and store the result
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Output the modified sentence
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}

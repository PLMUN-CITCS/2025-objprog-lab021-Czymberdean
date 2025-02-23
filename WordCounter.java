import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Get sentence input from user
        String sentence = getSentenceInput();

        // Count words in the sentence
        int wordCount = countWords(sentence);

        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine().trim(); // Trim to remove extra spaces
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0; // Return 0 if the input is empty
        }
        
        // Split sentence by spaces and count words
        String[] words = sentence.split("\\s+"); // Handles multiple spaces
        return words.length;
    }
}

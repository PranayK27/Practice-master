package Strings.level;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordRemover {
    public static void main(String[] args) {
        String inputString = "Java is a programming language and Java is widely used in the software industry.";

        // Removing duplicate words
        String result = removeDuplicateWords(inputString);

        System.out.println("String after removing duplicate words: " + result);
    }

    private static String removeDuplicateWords(String inputString) {
        // Splitting the string into words
        String[] words = inputString.split("\\s+");

        // Creating a set to store unique words
        Set<String> uniqueWords = new HashSet<>();

        // Removing duplicate words
        StringBuilder resultBuilder = new StringBuilder();
        for (String word : words) {
            if (uniqueWords.add(word)) {
                resultBuilder.append(word).append(" ");
            }
        }

        // Converting the StringBuilder to a string
        String result = resultBuilder.toString().trim();

        return result;
    }
}

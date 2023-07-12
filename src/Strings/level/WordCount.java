package Strings.level;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Java is a programming language.";

        // Removing leading and trailing whitespaces
        inputString = inputString.trim();

        // Splitting the string into words
        String[] words = inputString.split("\\s+");

        // Counting the number of words
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}

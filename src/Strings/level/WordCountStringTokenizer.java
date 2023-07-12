package Strings.level;
import java.util.StringTokenizer;

public class WordCountStringTokenizer {
    public static void main(String[] args) {
        String inputString = "Java is a programming language.";

        // Creating a StringTokenizer object
        StringTokenizer tokenizer = new StringTokenizer(inputString);

        // Counting the number of words
        int wordCount = tokenizer.countTokens();

        System.out.println("Number of words: " + wordCount);
    }
}

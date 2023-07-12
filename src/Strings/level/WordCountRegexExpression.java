package Strings.level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountRegexExpression {
    public static void main(String[] args) {
        String inputString = "Java is a programming language.";

        // Creating a pattern to match words
        Pattern pattern = Pattern.compile("\\b\\w+\\b");

        // Creating a matcher object
        Matcher matcher = pattern.matcher(inputString);

        // Counting the number of words
        int wordCount = 0;
        while (matcher.find()) {
            wordCount++;
        }

        System.out.println("Number of words: " + wordCount);
    }

}

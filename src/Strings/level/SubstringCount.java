package Strings.level;

public class SubstringCount {
    public static void main(String[] args) {
        String inputString = "Java is a widely used programming language. Java is versatile and has a large community.";

        String substring = "Java";

        int count = countSubstringOccurrences(inputString, substring);

        System.out.println("Number of occurrences of \"" + substring + "\": " + count);
    }

    private static int countSubstringOccurrences(String inputString, String substring) {
        int count = 0;
        int index = 0;

        while ((index = inputString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }
}

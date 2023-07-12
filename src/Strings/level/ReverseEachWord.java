package Strings.level;

public class ReverseEachWord {
    public static void main(String[] args) {

        reverseEachWord("java guides");

        reverseEachWord("I am string not reversed");

        reverseEachWord("Reverse Me");

    }

    private static String reverseEachWord(String originalStr) {

        // split the sentence by words using split method
        String[] words = originalStr.split(" ");

        String reverseStr = "";

        // Iterate over String array
        for (String word: words) {
            // reverse each word by calling reverseWithStringConcat method
            reverseStr = reverseStr + reverseWithStringConcat(word) + " ";
        }

        display(originalStr, reverseStr);
        return reverseStr;
    }

    private static final void display(String original, String reverse) {
        System.out.println(original);
        System.out.println(reverse);
        System.out.println("----------------------------");
    }
    private static final String reverseWithStringConcat(String string) {
        String reverseWord = "";
        for (int i = (string.length() - 1); i >= 0; i--) {
            reverseWord = reverseWord + string.charAt(i);
        }
        return reverseWord;
    }
}

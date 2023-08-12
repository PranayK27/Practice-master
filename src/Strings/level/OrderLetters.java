package Strings.level;

import java.util.Arrays;

public class OrderLetters {
    public static void main(String[] args) {
        String inputString="example";

        char[] charArray = inputString.toCharArray();

        Arrays.sort(charArray);

        String orderedString = new String(charArray);

        System.out.println("Original: "+inputString);
        System.out.println("Ordered: "+orderedString);
    }
}

package Java8.HackerRank.Strings;

import java.util.Stack;

class Result3 {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        // Write your code here
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (characterStack.isEmpty())
                characterStack.push(x);
            else if (x == characterStack.peek())
                characterStack.pop();
            else
                characterStack.push(x);
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (Character character : characterStack)
            resultBuilder.append(character);

        return resultBuilder.length() == 0 ?
                "Empty String" : resultBuilder.toString();

    }

}
public class SuperReducedString {
    public static void main(String[] args) {
        String s = "aaabccddd"; // aa / baab

        String result = Result3.superReducedString(s);
    }

}

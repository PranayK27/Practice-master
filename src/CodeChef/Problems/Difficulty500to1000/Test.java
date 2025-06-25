package CodeChef.Problems.Difficulty500to1000;

/*
Interview coding
Pig Latin (Igpay Atinlay) is a language game,
argot, or cant in which words in English are altered,
usually by adding a fabricated suffix or
by moving the onset or initial consonant or consonant
cluster of a word to the end of the word and adding a vocalic syllable (Wikipedia).

Rules
For words that begin with consonant sounds, these are also known as consonant blends (two letters that make one sound: e.g., black, slack, clown). The initial consonant blend (or two letters) is moved to the end of the word, then "ay" is added, as in the following examples:[15]
"pig" = "igpay"
"latin" = "atinlay"
"banana" = "ananabay"
"black" = "ackblay"
For words that begin with vowel sounds, "way" is added to the end:[15]
"a" = "away"
"open" = "openway"


**/
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            //   ["a","e","i","o","u"];
            if (!s.startsWith("a") && !s.startsWith("e") && !s.startsWith("i") && !s.startsWith("o") && !s.startsWith("u")) {
                char[] test = s.toCharArray();
                char temp;
                // try to get first element, hold it onto a temp, then try to remove the first char
                // then append that to the end with an "ay" for consonent
                    temp = test[0];
                    s = s.substring(1);
                    String n = s + temp + "ay";
                System.out.println(n);

            }

        }
    }
}

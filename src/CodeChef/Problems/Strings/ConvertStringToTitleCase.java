package CodeChef.Problems.Strings;

/*
Convert String to Title Case
Given a string S consisting of only lowercase and uppercase English letters and spaces, your task is to convert it into title case. In title case, the first letter of each word is capitalized while the rest are in lowercase, except for words that are entirely in uppercase (considered as acronyms), which should remain unchanged.

Note:

Words are defined as contiguous sequences of English letters separated by spaces.
Acronyms are words that are entirely in uppercase and should remain unchanged.
Assume the input does not contain leading, trailing, or multiple spaces between words.
Input Format
The first line contains a single integer T, the number of test cases.
Each of the next T lines contains a string S.
Output Format
For each test case, print a single line containing the string S converted into title case.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
∣
S
∣
≤
1000
1≤∣S∣≤1000, where
∣
S
∣
∣S∣ is the length of the string.

--- Input ---
5
hello world
this is a CODECHEF problem
WELCOME to the JUNGLE
the quick BROWN fOx
programming in PYTHON
--- Output ---
Hello World
This Is A CODECHEF Problem
WELCOME To The JUNGLE
The Quick BROWN Fox
Programming In PYTHON
**/

import java.util.Scanner;

public class ConvertStringToTitleCase {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T-- > 0) {
            String S = scanner.nextLine();

            StringBuilder result = new StringBuilder();
            String[] words = S.split(" ");

            for (String word: words) {
                result.append(formatWord(word)).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }

    static String formatWord(String word) {
        if (word.equals(word.toUpperCase())) {
            return word;
        }
        else {
            return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        }
    }
}

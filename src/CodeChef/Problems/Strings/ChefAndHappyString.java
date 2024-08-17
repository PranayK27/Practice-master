package CodeChef.Problems.Strings;

/*
Chef and Happy String
Chef has a string
S
S with him. Chef is happy if the string contains a contiguous substring of length strictly greater than
2
2 in which all its characters are vowels.

Determine whether Chef is happy or not.

Note that, in english alphabet, vowels are a, e, i, o, and u.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, a string
S
S.
Output Format
For each test case, if Chef is happy, print HAPPY else print SAD.

You may print each character of the string in uppercase or lowercase (for example, the strings hAppY, Happy, haPpY, and HAPPY will all be treated as identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
3
≤
∣
S
∣
≤
1000
3≤∣S∣≤1000, where
∣
S
∣
∣S∣ is the length of
S
S.
S
S will only contain lowercase English letters.

--- Input ---
4
aeiou
abxy
aebcdefghij
abcdeeafg
--- Output ---
Happy
Sad
Sad
Happy
**/

import java.util.Scanner;

public class ChefAndHappyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int count = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u' ){
                    count++;
                    if(count==3)
                        break;
                }
                else
                    count=0;
            }
            System.out.println(count>2?"Happy":"Sad");
        }
    }
}

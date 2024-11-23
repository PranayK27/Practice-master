package CodeChef.Problems.Strings.Difficulty1000Plus;

/*
Chef and the Wildcard Matching
Chef wants to implement wildcard pattern matching supporting only the wildcard '?'. The wildcard character '?' can be substituted by any single lower case English letter for matching. He has two strings X and Y of equal length, made up of lower case letters and the character '?'. He wants to know whether the strings X and Y can be matched or not.

Input
The first line of input contain an integer T denoting the number of test cases. Each test case consists of two lines, the first line contains the string X and the second contains the string Y.

Output
For each test case, output a single line with the word Yes if the strings can be matched, otherwise output No.

Constraints
1 ≤ T ≤ 50
Both X and Y have equal length and the length is between 1 and 10.
Both X and Y consist of lower case letters and the character '?'.


---Input---
2
s?or?
sco??
stor?
sco??

special case I/P:
3
abcdefghij
?bcde??hi?
?a?
?ba
??????????
?????a????

---Output---
Yes
No

special case O/P:
Yes
No
Yes

**/

import java.util.Scanner;

public class ChefAndWildcardMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            String x = scanner.next();
            String y = scanner.next();

            if (checkForWildcard(x, y)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    static boolean checkForWildcard(String s1, String s2) {
        Character wildcard = '?';
        Character wi, wj;

        // Your code goes here
        for (int k = 0; k < s1.length(); ) {
            wi = s1.charAt(k);
            wj = s2.charAt(k);

            if (wi.equals(wj) || wi.equals(wildcard) || wj.equals(wildcard)){
                k++;
            } else {
                return false;
            }
        }
        return true;
    }
}

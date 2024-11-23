package CodeChef.Problems.Strings.Difficulty1000Plus;
/*
Typing Letter
You have to type an email to send to your friend. The email can be represented as a string
T
T (which does not contain spaces). To complete your task you can perform any one of the following actions in one move:

Append a character at the end of the string.
Append a duplicate of the current string.
Find the minimum number of moves required to type the email.

Input Format
First-line will contain
T
T - the number of test cases. Then the test cases follow.
Each test case contains two lines of input.
The first line of every test case contains an integer
N
N - the size of the string.
The second line of every test case contains a string
T
T of size
N
N.
Output Format
For each testcase, output in a single line - the answer to the
i
i-th test case.

Constraints
1
≤
T
≤
150
1≤T≤150
1
≤
N
≤
2
⋅
1
0
3
,
∑
N
≤
5
⋅
1
0
3
1≤N≤2⋅10
3
 ,∑N≤5⋅10
3

The string contains only lowercase english letters

---Input---
3
6
oooobj
1
q
5
qqqqr
---Output---
5
1
4
**/

import java.util.Scanner;

public class TypingLetter {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // Size of the string
            String s = sc.next();  // The string itself

            // DP array to store the minimum moves
            int[] dp = new int[n + 1];
            dp[0] = 0; // Base case: 0 moves to build an empty string

            for (int i = 1; i <= n; i++) {
                // Case 1: Append one character
                dp[i] = dp[i - 1] + 1;

                // Case 2: Append duplicate of current string if possible
                if (i % 2 == 0) { // Only valid if `i` is even
                    int half = i / 2;
                    if (s.substring(0, half).equals(s.substring(half, i))) {
                        dp[i] = Math.min(dp[i], dp[half] + 1);
                    }
                }
            }

            // Result for this test case
            System.out.println(dp[n]);
        }
    }
}


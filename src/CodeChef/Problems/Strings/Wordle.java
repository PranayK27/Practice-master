package CodeChef.Problems.Strings;

/*
Wordle
Chef invented a modified wordle.

There is a hidden word
S
S and a guess word
T
T, both of length
5
5.

Chef defines a string
M
M to determine the correctness of the guess word. For the
i
t
h
i
th
  index:

If the guess at the
i
t
h
i
th
  index is correct, the
i
t
h
i
th
  character of
M
M is
G
G.
If the guess at the
i
t
h
i
th
  index is wrong, the
i
t
h
i
th
  character of
M
M is
B
B.
Given the hidden word
S
S and guess
T
T, determine string
M
M.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line contains the string
S
S - the hidden word.
Second line contains the string
T
T - the guess word.
Output Format
For each test case, print the value of string
M
M.

You may print each character of the string in uppercase or lowercase (for example, the strings
BgBgB
BgBgB,
BGBGB
BGBGB,
bgbGB
bgbGB and
bgbgb
bgbgb will all be treated as identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
∣
S
∣
=
∣
T
∣
=
5
∣S∣=∣T∣=5
S
,
T
S,T contain uppercase english alphabets only.


--- Input ---
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT
--- Output ---
BBGBB
GBBBB
GGBBG
**/

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            String t = sc.next();
            String m = "";
            for (int i = 0; i < 5; i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    m = m + "G";
                } else if (s.charAt(i) != t.charAt(i)) {
                    m = m + "B";
                }
            }
            System.out.println(m);
        }

    }
}

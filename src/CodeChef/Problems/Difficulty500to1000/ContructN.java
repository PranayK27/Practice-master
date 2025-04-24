package CodeChef.Problems.Difficulty500to1000;
/*
Construct N
You are given an integer
N
N. Find if it is possible to represent
N
N as the sum of several(possibly zero)
2
2's and several(possibly zero)
7
7's.

Formally, find if there exist two integers
X
,
Y

(
X
,
Y
≥
0
)
X,Y (X,Y≥0) such that
2
⋅
X
+
7
⋅
Y
=
N
2⋅X+7⋅Y=N.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line containing an integer
N
N.
Output Format
For each test case, print on a new line YES if it is possible to represent
N
N as the sum of several(possibly zero)
2
2's and several(possibly zero)
7
7's and NO otherwise.

You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
1
0
8
1≤N≤10
8

---Input---
4
2
5
7
11
---Output---
YES
NO
YES
YES
**/

import java.util.Scanner;

public class ContructN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            if (n < 7 && n % 2 != 0)
                System.out.println("no");
            else
                System.out.println("yes");
        }
    }
}

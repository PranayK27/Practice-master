package CodeChef.Problems.Difficulty500to1000;

/*
Cyclic Quadrilateral
Read problem statements in Mandarin Chinese, Russian, and Vietnamese as well.
You are given the sizes of angles of a simple quadrilateral (in degrees)
A
A,
B
B,
C
C and
D
D, in some order along its perimeter. Determine whether the quadrilateral is cyclic.

Note: A quadrilateral is cyclic if and only if the sum of opposite angles is
18
0
∘
180
∘
 .

Input
The first line of the input contains a single integer
T
T denoting the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains four space-separated integers
A
A,
B
B,
C
C and
D
D.
Output
Print a single line containing the string "YES" if the given quadrilateral is cyclic or "NO" if it is not (without quotes).

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1
≤
T
≤
1
0
4
1≤T≤10
4

1
≤
A
,
B
,
C
,
D
≤
357
1≤A,B,C,D≤357
A
+
B
+
C
+
D
=
360
A+B+C+D=360

---Input---
3
10 20 30 300
10 20 170 160
179 1 179 1
---Output---
NO
YES
NO
**/

import java.util.Scanner;

public class CyclicQuadrilateral {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if ((a + c) == 180 || (b + d) == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

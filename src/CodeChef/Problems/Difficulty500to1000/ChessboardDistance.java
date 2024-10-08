package CodeChef.Problems.Difficulty500to1000;

/*
Chessboard Distance
The Chessboard Distance for any two points
(
X
1
,
Y
1
)
(X
1
​
 ,Y
1
​
 ) and
(
X
2
,
Y
2
)
(X
2
​
 ,Y
2
​
 ) on a Cartesian plane is defined as
m
a
x
(
∣
X
1
−
X
2
∣
,
∣
Y
1
−
Y
2
∣
)
max(∣X
1
​
 −X
2
​
 ∣,∣Y
1
​
 −Y
2
​
 ∣).

You are given two points
(
X
1
,
Y
1
)
(X
1
​
 ,Y
1
​
 ) and
(
X
2
,
Y
2
)
(X
2
​
 ,Y
2
​
 ). Output their Chessboard Distance.

Note that,
∣
P
∣
∣P∣ denotes the absolute value of integer
P
P. For example,
∣
−
4
∣
=
4
∣−4∣=4 and
∣
7
∣
=
7
∣7∣=7.

Input Format
First line will contain
T
T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input containing
4
4 space separated integers -
X
1
,
Y
1
,
X
2
,
Y
2
X
1
​
 ,Y
1
​
 ,X
2
​
 ,Y
2
​
  - as defined in the problem statement.
Output Format
For each test case, output in a single line the chessboard distance between
(
X
1
,
Y
1
)
(X
1
​
 ,Y
1
​
 ) and
(
X
2
,
Y
2
)
(X
2
​
 ,Y
2
​
 )

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
X
1
,
Y
1
,
X
2
,
Y
2
≤
1
0
5
1≤X
1
​
 ,Y
1
​
 ,X
2
​
 ,Y
2
​
 ≤10
5

---Input---
3
2 4 5 1
5 5 5 3
1 4 3 3
---Output---
3
2
2
**/

import java.util.Scanner;

public class ChessboardDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int first = Math.abs(x1 - x2);
            int second = Math.abs(y1 - y2);

            System.out.println(Math.max(first, second));
        }
    }
}

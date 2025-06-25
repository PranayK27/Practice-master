package CodeChef.Problems.Difficulty500to1000;
/*
Two Ranges
Chef has two ranges
[
A
,
B
]
[A,B] and
[
C
,
D
]
[C,D]. Chef needs to find the number of integers that belong to at least one of the ranges.

Note: A range
[
P
,
Q
]
[P,Q] contains all the integers
{
P
,
P
+
1
,
P
+
2
,
…
,
Q
−
1
,
Q
}
{P,P+1,P+2,…,Q−1,Q}.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line containing
4
4 integers
A
,
B
,
C
,
A,B,C, and
D
D, as mentioned in the statement.
Output Format
For each test case, output on a new line, the number of integers that belong to at least one of the ranges.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
A
≤
B
≤
8
1≤A≤B≤8
1
≤
C
≤
D
≤
8
1≤C≤D≤8

---Input---
4
1 3 5 5
3 8 2 5
1 8 4 6
5 5 5 5
---Output---
4
7
8
1
**/


import java.util.Scanner;

public class TwoRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int count=0;
            for (int i=1; i<=8; i++) {
                if(a <= i && i<=b){
                    count++;
                } else if(c <= i && i<=d) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

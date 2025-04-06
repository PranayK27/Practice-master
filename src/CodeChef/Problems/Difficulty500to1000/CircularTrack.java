package CodeChef.Problems.Difficulty500to1000;
/*
Circular Track
There is a circular track of length
M
M consisting of
M
M checkpoints and
M
M bidirectional roads such that each road has a length of
1
1 unit.



Chef is currently at checkpoint
A
A and wants to reach checkpoint
B
B. Find the minimum length of the road he needs to travel.

Input Format
First line will contain
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, three integers
A
,
B
,
A,B, and
M
M - the initial checkpoint, the final checkpoint, and the total number of checkpoints respectively.
Output Format
For each test case, output the minimum length Chef needs to travel.

Constraints
1
≤
T
≤
1000
1≤T≤1000
2
≤
M
≤
1
0
9
2≤M≤10
9

1
≤
A
,
B
≤
M
1≤A,B≤M
A
≠
B
A=B

---Input---
4
1 3 100
1 98 100
40 30 50
2 1 2
---Output---
2
3
10
1
**/

import java.util.Scanner;

public class CircularTrack {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = sc.nextInt();
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
                System.out.println(CircularTrack.solve(a,b,m));
            } else {
                System.out.println(CircularTrack.solve(a,b,m));
            }
        }
    }
    static int solve(int a , int b, int m){
        int val1 = b-a;
        int val2 = m-b+a;
        return Math.min(val1,val2);
    }
}

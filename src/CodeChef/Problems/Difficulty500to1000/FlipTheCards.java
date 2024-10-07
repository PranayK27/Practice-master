package CodeChef.Problems.Difficulty500to1000;

/*
Flip the cards
There are
N
N cards on a table, out of which
X
X cards are face-up and the remaining are face-down.

In one operation, we can do the following:

Select any one card and flip it (i.e. if it was initially face-up, after the operation, it will be face-down and vice versa)
What is the minimum number of operations we must perform so that all the cards face in the same direction (i.e. either all are face-up or all are face-down)?

Input Format
The first line contains a single integer
T
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers
N
N and
X
X — the total number of cards and the number of cards which are initially face-up.
Output Format
For each test case, output the minimum number of cards you must flip so that all the cards face in the same direction.

Constraints
1≤T≤5000
2≤N≤100
0≤X≤N


---Input---
4
5 0
4 2
3 3
10 2
---Output---
0
2
0
2
**/

import java.util.Scanner;

public class FlipTheCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (x == 0 || n == x) {
                System.out.println(0);
            } else {
                System.out.println(Math.min((n-x), x));
            }
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;

/*
A or B
There are two problems in a contest.

Problem A is worth
500
500 points at the start of the contest.
Problem B is worth
1000
1000 points at the start of the contest.
Once the contest starts, after each minute:

Maximum points of Problem A reduce by
2
2 points .
Maximum points of Problem B reduce by
4
4 points.
It is known that Chef requires
X
X minutes to solve Problem A correctly and
Y
Y minutes to solve Problem B correctly.

Find the maximum number of points Chef can score if he optimally decides the order of attempting both the problems.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers
X
X and
Y
Y - the time required to solve problems
A
A and
B
B in minutes respectively.
Output Format
For each test case, output in a single line, the maximum number of points Chef can score if he optimally decides the order of attempting both the problems.

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
,
Y
≤
100
1≤X,Y≤100

---Input---
4
10 20
8 40
15 15
20 10

---Output---
1360
1292
1380
1400
**/

import java.util.Scanner;

public class AorB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int firstA = 500 - x * 2;
            int secondB = 1000 - (y+x) * 4;
            int secondA = 500 - (x+y) * 2;
            int firstB = 1000 - y * 4;

            int AthenB = firstA + secondB;
            int BthenA = secondA + firstB;

            if (AthenB > BthenA) {
                System.out.println(AthenB);
            } else {
                System.out.println(BthenA);
            }
        }
    }
}

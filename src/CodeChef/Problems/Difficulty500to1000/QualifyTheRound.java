package CodeChef.Problems.Difficulty500to1000;

/*
Qualify the round
In a coding contest, there are two types of problems:

Easy problems, which are worth
1
1 point each
Hard problems, which are worth
2
2 points each
To qualify for the next round, a contestant must score at least
X
X points. Chef solved
A
A Easy problems and
B
B Hard problems. Will Chef qualify or not?

Input Format
The first line of input contains a single integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
Each test case consists of a single line of input containing three space-separated integers —
X
,
A
X,A, and
B
B.
Output Format
For each test case, output a new line containing the answer — Qualify if Chef qualifies for the next round, and NotQualify otherwise.

Each character of the answer may be printed in either uppercase or lowercase. For example, if the answer is Qualify, outputs such as qualify, quALiFy, QUALIFY and QuAlIfY will also be accepted as correct.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
≤
100
1≤X≤100
0
≤
A
,
B
≤
100
0≤A,B≤100

---Input---
3
15 9 3
5 3 0
6 2 8
---Output---
Qualify
NotQualify
Qualify
**/

import java.util.Scanner;

public class QualifyTheRound {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a+(2*b) >= x){
                System.out.println("Qualify");
            } else System.out.println("NotQualify");
        }
    }
}

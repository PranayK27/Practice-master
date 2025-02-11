package CodeChef.Problems.Difficulty500to1000;
/*
Reach fast
Chef is standing at coordinate
A
A while Chefina is standing at coordinate
B
B.

In one step, Chef can increase or decrease his coordinate by at most
K
K.

Determine the minimum number of steps required by Chef to reach Chefina.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of three integers
A
,
B
,
A,B, and
K
K, the initial coordinate of Chef, the initial coordinate of Chefina and the maximum number of coordinates Chef can move in one step.
Output Format
For each test case, output the minimum number of steps required by Chef to reach Chefina.

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
,
B
≤
100
1≤A,B≤100
1
≤
K
≤
100
1≤K≤100

---Input---
4
10 20 3
36 36 5
50 4 100
30 4 2
1 6 3
---Output---
4
0
1
13
2
**/

import java.util.Scanner;

public class ReachFast {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            if (a == b) {
                System.out.println("0");
            } else{
                System.out.println((Math.abs(a-b) + k - 1)/k);
            }
        }
    }
}

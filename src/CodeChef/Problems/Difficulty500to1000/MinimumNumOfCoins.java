package CodeChef.Problems.Difficulty500to1000;

/*
Minimum number of coins
Chef has infinite coins in denominations of rupees
5
5 and rupees
10
10.

Find the minimum number of coins Chef needs, to pay exactly
X
X rupees. If it is impossible to pay
X
X rupees in denominations of rupees
5
5 and
10
10 only, print
−
1
−1.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single integer
X
X.
Output Format
For each test case, print a single integer - the minimum number of coins Chef needs, to pay exactly
X
X rupees. If it is impossible to pay
X
X rupees in denominations of rupees
5
5 and
10
10 only, print
−
1
−1.

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
≤
1000
1≤X≤1000
Subtasks
Subtask 1 (100 points): Original constraints.


---Input---
3
50
15
8
---Output---
5
2
-1
**/

import java.util.Scanner;

public class MinimumNumOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x%10 == 0){
                System.out.println(Math.min(x/5, x/10));
            } else if(x%5 == 0){
                if ((x/5) == 1){
                    System.out.println(x/5);
                } else {
                    System.out.println(Math.min((x/5)-1, (x/10)+1));
                }
            } else System.out.println("-1");
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;

/*
Single-use Attack
Chef is playing a video game, and is now fighting the final boss.

The boss has
H
H health points. Each attack of Chef reduces the health of the boss by
X
X.
Chef also has a special attack that can be used at most once, and will decrease the health of the boss by
Y
Y.

Chef wins when the health of the boss is
≤
0
≤0.
What is the minimum number of attacks needed by Chef to win?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first and only line of each test case will contain three space-separated integers
H
,
X
,
Y
H,X,Y — the parameters described in the statement.
Output Format
For each test case, output on a new line the minimum number of attacks needed by Chef to win.

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
<
Y
≤
H
≤
100
1≤X<Y≤H≤100

---Input---
4
100 25 40
100 29 45
46 1 2
78 15 78
---Output---
4
3
45
1
**/

import java.util.Scanner;

public class SingleUseAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y>=h){
                System.out.println("1");
            } else {
                System.out.println(1+(int)((double) ((h - y + x - 1) / x)));
                // System.out.println(1+(int)(Math.ceil((h - y + x - 1) /x)));
            }
        }
    }
}

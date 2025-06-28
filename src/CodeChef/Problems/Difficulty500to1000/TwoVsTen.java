package CodeChef.Problems.Difficulty500to1000;
/*
Two vs Ten
Read problems statements in Mandarin chinese, Russian and Vietnamese as well.
Chef Two and Chef Ten are playing a game with a number
X
X. In one turn, they can multiply
X
X by
2
2. The goal of the game is to make
X
X divisible by
10
10.

Help the Chefs find the smallest number of turns necessary to win the game (it may be possible to win in zero turns) or determine that it is impossible.

Input
The first line of the input contains a single integer
T
T denoting the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains a single integer denoting the initial value of
X
X.
Output
For each test case, print a single line containing one integer — the minimum required number of turns or
−
1
−1 if there is no way to win the game.

Constraints
1
≤
T
≤
1000
1≤T≤1000
0
≤
X
≤
1
0
9
0≤X≤10
9

---Input---
3
10
25
1
---Output---
0
1
-1
**/


import java.util.Scanner;

public class TwoVsTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int c=0;
            if (x%10==0){
                System.out.println(0);
            } else {
                if((x*2)%10==0){
                    c++;
                    System.out.println(c);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}

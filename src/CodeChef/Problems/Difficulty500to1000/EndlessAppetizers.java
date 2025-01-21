package CodeChef.Problems.Difficulty500to1000;

/*
Endless Appetizers
Life is a like a box of of mozzarella sticks. You never know what you're gonna get, but you can predict with 100 percent accuracy that it will be a mozzarella stick.

Chef's colleague issued a challenge to Chef: "If you eat more than
X
X mozzarella sticks, I'll give you
30
30 rupees for each extra one you eat".
For example, if
X
=
5
X=5 and Chef eats
8
8 sticks, he would receive
90
90 rupees because he ate
3
3 extra sticks.

You know that the restaurant serves
Y
Y mozzarella sticks per plate.
You also know that Chef received
R
R rupees from his colleague as a result of the challenge.

What's the maximum number of plates of mozzarella sticks that Chef could have ordered?

Note:

Chef won't order a new plate till he finishes eating all the sticks from the previous one.
However, it's possible that Chef didn't finish all the sticks from the final plate he ordered.
See the explained examples below for more clarification.
Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of one line of input, containing three space-separated integers
X
,
Y
,
X,Y, and
R
R — the lower limit on the number of sticks, the number of sticks on a single plate, and the money received by Chef.
Output Format
For each test case, output on a new line the answer: the maximum number of plates Chef could have ordered.

Constraints
1
≤
T
≤
1
0
4
1≤T≤10
4

1
≤
X
≤
100
1≤X≤100
1
≤
Y
≤
10
1≤Y≤10
0
≤
R
≤
3
⋅
1
0
4
0≤R≤3⋅10
4

It is guaranteed that
R
R is a multiple of
30
30.

---Input---
4
7 5 30
16 5 0
15 9 120
23 1 2130
---Output---
2
4
3
94
**/

import java.util.Scanner;

public class EndlessAppetizers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int R=sc.nextInt();
            int N=R/30; // extra stick eaten
            int C=X+N; // total eaten
            int D=C/Y; // plates required
            if(C%Y==0)System.out.println(D);
            else System.out.println(D+1);
        }
    }
}

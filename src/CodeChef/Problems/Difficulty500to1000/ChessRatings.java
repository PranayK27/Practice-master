package CodeChef.Problems.Difficulty500to1000;

/*
Chess Ratings
Alice has recently started playing Chess. Her current rating is
X
X. She noticed that when she wins a game, her rating increases by
8
8 points.

Can you help Alice in finding out the minimum number of games she needs to win in order to make her rating greater than or equal to
Y
Y?

Input Format
The first line of input will contain an integer
T
T — the number of test cases. The description of
T
T test cases follows.
The first line of each test case contains two integers
X
X and
Y
Y, as described in the problem statement.
Output Format
For each test case, output the minimum number of games that Alice needs to win in order to make her rating greater than or equal to
Y
Y.

Constraints
1≤T≤10^4
1≤X≤Y≤10^4

---Input---
4
10 10
10 17
10 18
10 19
---Output---
0
1
1
2

**/

import java.util.Scanner;

public class ChessRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == y) {
                System.out.println("0");
            } else if (x < y) {
                if (y - x <= 8) {
                    System.out.println("1");
                } else {
                    if ((y - x) % 8 != 0) {
                        System.out.println(((y - x) / 8) + 1);
                    } else System.out.println(((y - x) / 8));
                }
            }
        }
    }
}

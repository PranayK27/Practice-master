package CodeChef.Problems.Difficulty500to1000;

import java.util.Scanner;

/*
Jenga Night
Chef hosts a party for his birthday. There are
N
N people at the party. All these
N
N people decide to play Jenga.

There are
X
X Jenga tiles available. In one round, all the players pick
1
1 tile each and place it in the tower.
The game is valid if:

All the players have a tile in each round;
All the tiles are used at the end.
Given
N
N and
X
X, find whether the game is valid.

Input Format
First line will contain
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, containing two space-separated integers
N
N and
X
X representing the number of people at the party and the number of available tiles respectively.
Output Format
For each test case, output in a single line
YES
YES if the game is valid, else output
NO
NO.

You may print each character of the string in uppercase or lowercase (for example, the strings
YeS
YeS,
yEs
yEs,
yes
yes and
YES
YES will all be treated as identical).

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
N
,
X
≤
1000
1≤N,X≤1000

---Input---
3
3 3
4 2
2 4
---Output---
YES
NO
YES
**/

public class JengaNight {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if(x%n==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

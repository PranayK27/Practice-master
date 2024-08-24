package CodeChef.Problems.Difficulty500to1000;

/*
Is the Score Consistent
Chef is watching a football match. The current score is
A
:
B
A:B, that is, team
1
1 has scored
A
A goals and team
2
2 has scored
B
B goals. Chef wonders if it is possible for the score to become
C
:
D
C:D at a later point in the game (i.e. team
1
1 has scored
C
C goals and team
2
2 has scored
D
D goals). Can you help Chef by answering his question?

Input Format
The first line contains a single integer
T
T - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers
A
A and
B
B - the intial number of goals team
1
1 and team
2
2 have scored respectively.
The second line of each test case contains two integers
C
C and
D
D - the final number of goals team
1
1 and team
2
2 must be able to score respectively.
Output Format
For each testcase, output POSSIBLE if it is possible for the score to become
C
:
D
C:D at a later point in the game, IMPOSSIBLE otherwise.

You may print each character of POSSIBLE and IMPOSSIBLE in uppercase or lowercase (for example, possible, pOSsiBLe, Possible will be considered identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
0
≤
A
,
B
,
C
,
D
≤
10
0≤A,B,C,D≤10

---Input---
3
1 5
3 5
3 4
2 6
2 2
2 2
---Output---
POSSIBLE
IMPOSSIBLE
POSSIBLE
**/

import java.util.Scanner;

public class IsTheScoreConsistent {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(a<=c && b<=d){
                System.out.println("POSSIBLE");
            } else System.out.println("IMPOSSIBLE");
        }
    }
}

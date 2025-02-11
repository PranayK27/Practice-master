package CodeChef.Problems.Difficulty500to1000;

/*
Possible Victory
Chef is playing in a T20 cricket match. In a match, Team A plays for 20 overs. In a single over, the team gets to play 6 times, and in each of these 6 tries, they can score a maximum of 6 runs. After Team A's 20 overs are finished, Team B similarly plays for 20 overs and tries to get a higher total score than the first team. The team with the higher total score at the end wins the match.

Chef is in Team B. Team A has already played their 20 overs, and have gotten a score of
R
R. Chef's Team B has started playing, and have already scored
C
C runs in the first
O
O overs. In the remaining
20
−
O
20−O overs, find whether it is possible for Chef's Team B to get a score high enough to win the game. That is, can their final score be strictly larger than
R
R?

Input Format
There is a single line of input, with three integers,
R
,
O
,
C
R,O,C.
Output Format
Output in a single line, the answer, which should be "YES" if it's possible for Chef's Team B to win the match and "NO" if not.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
0
≤
C
≤
R
≤
720
0≤C≤R≤720
1
≤
O
≤
19
1≤O≤19
0
≤
C
≤
36
∗
O
0≤C≤36∗O

---Input---
719 18 648
720 18 648
---Output---
YES
NO
**/

import java.util.Scanner;

public class PossibleVictory {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int o = sc.nextInt();
        int c = sc.nextInt();

        int remainingOvers = 20 - o;
        int maxRunsInRemainingOvers = (6*remainingOvers)*6;
        if(c+maxRunsInRemainingOvers > r){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

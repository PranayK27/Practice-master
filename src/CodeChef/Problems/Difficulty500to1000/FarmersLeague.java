package CodeChef.Problems.Difficulty500to1000;
/*
Farmers League
A football league of
N
N teams is taking place, where each team plays other teams once in single round robin fashion. A team gets
3
3 points for winning a game and
0
0 for losing (assume that no games end in a draw/tie). What is the maximum possible difference of points between the winning team and the second-placed team?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing a single integer
N
N.
Output Format
For each test case, output in a single line the maximum difference of points between first and second place.

Constraints
1
≤
T
≤
1
0
5
1≤T≤10
5

2
≤
N
≤
1
0
9
2≤N≤10
9

---Input---

---Output---
**/

import java.util.Scanner;

public class FarmersLeague {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(3*(n/2));
        }
    }
}

/*
PROBLEM:
Find the maximum number of points by which a team can win a
N
N-team league, if each team plays every other team in round robin fashion. Teams get
3
3 points for a win and
0
0 points for a loss. (Assume there are no draws).

EXPLANATION:
The answer can mainly be gathered with the following hints.

 Winning team wins all
This is necessary to maximise the points of the winner team. Therefore the total number of points of the winning team will be
3∗(N−1).

 Other teams perform similarly
If the second placed team performs similar to other teams apart from team A(winning team), that helps in minimizing the total points.
So, the second placed team will play a total of
N−2 games with teams other than the winning team. If they win half games and lose halfgames, that will help in keeping their points total to a minimum. So, points gathered will be

ceil((N−2)/2)∗3. Ceil function is used so that in case N is odd, second placed team will win one game more than the last placed team (as you can check for
N=3).

Final Answer
Final Answer will be the difference of the points total of the first and the second placed teams.
∴ans=3∗(N−1)−ceil((N−2)/2)∗3=3∗(N/2)
**/

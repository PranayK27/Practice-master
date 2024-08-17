package CodeChef.Problems.Strings;

/*
World Chess Championship
The World Chess Championship
2022
2022 is about to start.
14
14 Classical games will be played between Chef and Carlsen in the championship, where each game has one of three outcomes — it can be won by Carlsen, won by Chef, or it can be a draw. The winner of a game gets
2
2 points, and the loser gets
0
0 points. If it’s a draw, both players get
1
1 point each.

The total prize pool of the championship is
100
⋅
X
100⋅X. At end of the
14
14 Classical games, if one player has strictly more points than the other, he is declared the champion and gets
60
⋅
X
60⋅X as his prize money, and the loser gets
40
⋅
X
40⋅X.

If the total points are tied, then the defending champion Carlsen is declared the winner. However, if this happens, the winner gets only
55
⋅
X
55⋅X, and the loser gets
45
⋅
X
45⋅X.

Given the results of all the
14
14 games, output the prize money that Carlsen receives.

The results are given as a string of length
14
14 consisting of the characters C, N, and D.

C denotes a victory by Carlsen.
N denotes a victory by Chef.
D denotes a draw.
Input Format
The first line of input contains an integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
The first line of each test case contains one integer
X
X, denoting that the total prize pool is
100
⋅
X
100⋅X.
The second line contains the results of the match, as a string of length
14
14 containing only the characters C, N, and D.
Output Format
For each test case, output in a single line the total prize money won by Carlsen.

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
1
0
6
1≤X≤10
6

∣
S
∣
=
14
∣S∣=14
S
S contains only characters D, C, N.
Subtasks
Subtask #1 (100 points): Original constraints
------ INPUTS -----
4
100
CCCCCCCCCCCCCC
400
CDCDCDCDCDCDCD
30
DDCCNNDDDCCNND
1
NNDNNDDDNNDNDN

------ OUTPUTS -----
6000
24000
1650
40

**/

import java.util.Scanner;

public class WorldChessChampionship {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int total = 14;
            int countC = 0, countN = 0, countD = 0;
            int champ = 60, runner = 40, more = 55, less=45;
            int x = sc.nextInt();
            String g = sc.next();
            char[] charArray = g.toCharArray();
            for(int i=0; i < total; i++){
                if(charArray[i] == 'C'){
                    countC++;
                } else if(charArray[i] == 'N'){
                    countN++;
                } else if(charArray[i] == 'D'){
                    countD++;
                }
            }
            if(countC > countN){
                System.out.println(champ * x);
            } else if(countC == countN){
                System.out.println(more * x);
            } else if(countC < countN){
                System.out.println(runner * x);
            }
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;
/*
The Last Levels
Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.

There are
X
X levels remaining in the game, and each level takes Chef
Y
Y minutes to complete. To protect against eye strain, Chef also decides that every time he completes
3
3 levels, he will take a
Z
Z minute break from playing. Note that there is no need to take this break if the game has been completed.

How much time (in minutes) will it take Chef to complete the game?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first and only line of input will contain three space-separated integers
X
X,
Y
Y, and
Z
Z.
Output Format
For each test case, output on a new line the answer — the length of Chef's gaming session.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
≤
100
1≤X≤100
5
≤
Y
≤
100
5≤Y≤100
5
≤
Z
≤
15
5≤Z≤15

---Input---
4
2 12 10
3 12 10
7 20 8
24 45 15
---Output---
24
36
156
1185
**/

import java.util.Scanner;

public class TheLastLevels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x<=3){
                System.out.println(x*y);
            } else {
                if(x%3==0){
                    System.out.println((x*y)+(((x/3)-1)*z));
                } else System.out.println((x*y)+((x/3)*z));
            }
        }
    }
}

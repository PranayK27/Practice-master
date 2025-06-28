package CodeChef.Problems.Difficulty500to1000;
/*
Penalty Shots
Read problem statements in Russian, Mandarin Chinese, Bengali, and Vietnamese as well.
It's the soccer match finals in Chefland and as always it has reached the penalty shootouts. Each team is given
5
5 shots to make and the team scoring a goal on the maximum number of shots wins the game. If both the teams' scores are equal, then the game is considered a draw and we would have
2
2 champions.

Given ten integers
A
1
,
A
2
,
…
,
A
10
A
1
​
 ,A
2
​
 ,…,A
10
​
 , where the odd indexed integers(
A
1
,
A
3
,
A
1
​
 ,A
3
​
 ,
A
5
,
A
5
​
 ,
A
7
,
A
9
A
7
​
 ,A
9
​
 ) represent the outcome of the shots made by team
1
1 and even indexed integers(
A
2
,
A
4
,
A
6
,
A
8
,
A
10
A
2
​
 ,A
4
​
 ,A
6
​
 ,A
8
​
 ,A
10
​
 ) represent the outcome of the shots made by team
2
2 (here
A
i
=
1
A
i
​
 =1 indicates that it's a goal and
A
i
=
0
A
i
​
 =0 indicates a miss), determine the winner or find if the game ends in a draw.

Input Format
The first line of input contains a single integer
T
T denoting the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains ten space-separated integers
A
1
,
A
2
,
…
,
A
10
A
1
​
 ,A
2
​
 ,…,A
10
​
 .
Output Format
For each test case, print a single line containing one integer -
0
0 if the game ends in a draw or
1
1 if the first team wins or
2
2 if the second team wins.

Constraints
1
≤
T
≤
1024
1≤T≤1024
0
≤
A
i
≤
1
0≤A
i
​
 ≤1

---Input---
4
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1
1 0 1 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 0
---Output---
0
2
1
1
**/


import java.util.Scanner;

public class PenaltyShots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[10];
            int team1=0;
            int team2=0;
            for (int i=0; i<10; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j=0; j<10; j++) {
                if (j==0){
                    if(arr[j]==0){
                        continue;
                    } else if(arr[j]==1) {
                        team1++;
                    }
                } else if (j%2==0){
                    if(arr[j]==0){
                        continue;
                    } else if(arr[j]==1) {
                        team1++;
                    }
                } else {
                    if(arr[j]==0){
                        continue;
                    } else if(arr[j]==1) {
                        team2++;
                    }
                }
            }
            if (team1==team2) {
                System.out.println(0);
            } else if (team1 > team2) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}

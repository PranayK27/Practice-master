package CodeChef.Problems.Difficulty500to1000;

import java.util.Scanner;

/*
Discus Throw
In discus throw, a player is given
3
3 throws and the throw with the longest distance is regarded as their final score.

You are given the distances for all
3
3 throws of a player. Determine the final score of the player.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers
A
,
B
,
A,B, and
C
C denoting the distances in each throw.
Output Format
For each test case, output the final score of the player.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
A
,
B
,
C
≤
100
1≤A,B,C≤100

--- Input ---
3
10 15 8
32 32 32
82 45 54

--- Output ---
15
32
82

**/
public class DiscusThrow {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b && a>=c){
                System.out.println(a);
            }else if(b>=a && b>=c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }
}

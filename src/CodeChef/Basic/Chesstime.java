package CodeChef.Basic;

import java.util.Scanner;

/** Problem */
/**
 * Chef has recently started playing chess, and wants to play as many games as possible.

He calculated that playing one game of chess takes at least 2020 minutes of his time.

Chef has NN hours of free time. What is the maximum number of complete chess games he can play in that time?

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a single line containing a single integer, NN.
Output Format
For each test case, output on a new line the maximum number of complete chess games Chef can play in NN hours.

Constraints
1 \leq T \leq 101≤T≤10
1 \leq N \leq 101≤N≤10
Sample 1:
* Input
4
1
10
7
3
* Output
3
30
21
9
Explanation:
Test case 1: If every game Chef plays takes 20 minutes, he can play 3 games in one hour.

Test case 2: If every game Chef plays takes 20 minutes, he can play 30 games in 10 hours.

Test case 3: If every game Chef plays takes 20 minutes, he can play 21 games in 7 hours.

Test case 4: If every game Chef plays takes 20 minutes, he can play 9 games in 3 hours.
*  */

public class Chesstime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int hours=sc.nextInt();
            int count=0, games;
            int minutes;
            if(hours>=1){
                minutes=hours*60;
                games = minutes/20;
                System.out.println(games);
            }
        }

    }
}

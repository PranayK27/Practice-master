package CodeChef.Problems.Difficulty500to1000;

/*
Chefland Games
In Chefland, a tennis game involves
4
4 referees.
Each referee has to point out whether he considers the ball to be inside limits or outside limits. The ball is considered to be IN if and only if all the referees agree that it was inside limits.

Given the decision of the
4
4 referees, help Chef determine whether the ball is considered inside limits or not.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line of input containing
4
4 integers
R
1
,
R
2
,
R
3
,
R
4
R
1
​
 ,R
2
​
 ,R
3
​
 ,R
4
​
  denoting the decision of the respective referees.
Here
R
R can be either
0
0 or
1
1 where
0
0 would denote that the referee considered the ball to be inside limits whereas
1
1 denotes that they consider it to be outside limits.

Output Format
For each test case, output IN if the ball is considered to be inside limits by all referees and OUT otherwise.

The checker is case-insensitive so answers like in, In, and IN would be considered the same.

Constraints
1
≤
T
≤
20
1≤T≤20
0
≤
R
1
,
R
2
,
R
3
,
R
4
≤
1
0≤R
1
​
 ,R
2
​
 ,R
3
​
 ,R
4
​
 ≤1

 ---Input---
 4
1 1 0 0
0 0 0 0
0 0 0 1
1 1 1 1
 ---Output---
 OUT
IN
OUT
OUT
**/

import java.util.Scanner;

public class CheflandGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();

            int in=0, out=0;

            if((a | b | c | d) == 1){
                out++;
            } else if((a | b | c | d) == 0){
                in++;
            }

            if(in == out || out > in){
                System.out.println("OUT");
            } else {
                System.out.println("IN");
            }
        }
    }
}

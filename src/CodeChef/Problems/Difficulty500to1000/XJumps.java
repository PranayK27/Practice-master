package CodeChef.Problems.Difficulty500to1000;
/*
X Jumps
Chef is currently standing at stair
0
0 and he wants to reach stair numbered
X
X.

Chef can climb either
Y
Y steps or
1
1 step in one move.
Find the minimum number of moves required by him to reach exactly the stair numbered
X
X.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line of input containing two space separated integers
X
X and
Y
Y denoting the number of stair Chef wants to reach and the number of stairs he can climb in one move.
Output Format
For each test case, output the minimum number of moves required by him to reach exactly the stair numbered
X
X.

Constraints
1
≤
T
≤
500
1≤T≤500
1
≤
X
,
Y
≤
100
1≤X,Y≤100

---Input---
4
4 2
8 3
3 4
2 1
---Output---
2
4
3
2
**/

import java.util.Scanner;

public class XJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x<y){
                System.out.println(x);
            } else {
                if((x%y) == 0){
                    System.out.println(x/y);
                } else {
                    System.out.println((x/y)+((x%y)));
                }
            }
        }
    }
}

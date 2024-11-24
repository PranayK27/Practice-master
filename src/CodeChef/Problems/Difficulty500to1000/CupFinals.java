package CodeChef.Problems.Difficulty500to1000;

/*
Cup Finals
It is the World Cup Finals. Chef only finds a match interesting if the skill difference of the competing teams is less than or equal to
D
D.

Given that the skills of the teams competing in the final are
X
X and
Y
Y respectively, determine whether Chef will find the game interesting or not.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of testcases. The description of
T
T testcases follows.
Each testcase consists of a single line of input containing three space-separated integers
X
X,
Y
Y, and
D
D — the skill levels of the teams and the maximum skill difference.
Output Format
For each testcase, output "YES" if Chef will find the game interesting, else output "NO" (without the quotes). The checker is case-insensitive, so "YeS" and "nO" etc. are also acceptable.

Constraints
1
≤
T
≤
2000
1≤T≤2000
1
≤
X
,
Y
≤
100
1≤X,Y≤100
0
≤
D
≤
100
0≤D≤100

---Input---
3
5 3 4
5 3 1
5 5 0
---Output---
YES
NO
YES
**/


import java.util.Scanner;

public class CupFinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int d = sc.nextInt();

            if((x >= y && (x-y)<=d) || (y >= x && (y-x)<=d)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

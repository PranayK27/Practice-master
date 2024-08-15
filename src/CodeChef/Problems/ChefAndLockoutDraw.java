package CodeChef.Problems;

import java.util.Scanner;

/*
Chef and Lockout Draws
Bob and Alice are having a lockout match between them. There are three problems in the contest worth
�
A,
�
B, and
�
C points respectively. Only the first player to solve a problem gets points for that problem. It is impossible for Bob and Alice to solve a problem at the same time. Chef wants to know if there is any chance of a draw if Bob and Alice manage to solve all
3
3 problems. A draw occurs when both players end with equal number of points.

Input Format
First line will contain
�
T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, three space separated integers
�
A,
�
B, and
�
C.
Output Format
For each testcase, output YES if the match can end in a draw, and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1
≤
�
≤
1000
1≤T≤1000
1
≤
�
,
�
,
�
≤
1
0
6
1≤A,B,C≤10
6

Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
3
2 5 2
4 2 2
3 5 5
Output
NO
YES
NO
Explanation:
In the first and third test cases, it is impossible for Bob and Alice to solve the problems so that they have the same number of points at the end.

In the second case, it is possible for Bob to solve the first problem, and Alice to solve the last two problems, in which case they will both have 4 points and the game will end in a draw.
* */
public class ChefAndLockoutDraw {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a + b == c) || (b + c == a) || (a + c == b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

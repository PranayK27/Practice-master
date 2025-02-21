package CodeChef.Problems.Difficulty500to1000;
/*
The Preparations
Chef has an exam which will start exactly
M
M minutes from now. However, instead of preparing for his exam, Chef started watching Season-
1
1 of Superchef. Season-
1
1 has
N
N episodes, and the duration of each episode is
K
K minutes.

Will Chef be able to finish watching Season-
1
1 strictly before the exam starts?

Note:
Note: Please read the explanations of the sample test cases carefully.

Input Format
The first line contains an integer
T
T denoting the number of test cases.
T
T test cases then follow.
The first and only line of each test case contains
3
3 space separated integers
M
M,
N
N and
K
K.
Output Format
For each test case, output on one line YES if it is possible to finish Season-1 strictly before the exam starts, or NO if it is not possible to do so.

Output is case insensitive, which means that "yes", "Yes", "YEs", "no", "nO" - all such strings will be acceptable.

Constraints
1
≤
T
≤
1
0
4
1≤T≤10
4

1
≤
M
≤
1
0
9
1≤M≤10
9

1
≤
N
,
K
≤
1
0
4
1≤N,K≤10
4

---Input---
3
10 1 10
25 2 10
15 2 10
---Output---
NO
YES
NO
**/

import java.util.Scanner;

public class ThePreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int k=sc.nextInt();

            if(m > n*k){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

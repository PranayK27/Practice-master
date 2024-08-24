package CodeChef.Problems.Difficulty500to1000;

/*
CRED Coins
For each bill you pay using CRED, you earn
X
X CRED coins.
At CodeChef store, each bag is worth
100
100 CRED coins.

Chef pays
Y
Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers
X
X and
Y
Y.
Output Format
For each test case, output in a single line - the maximum number of bags Chef can get from the CodeChef store.

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
,
Y
≤
1000
1≤X,Y≤1000
Subtasks
Subtask 1 (100 points): Original constraints.

---INPUT---
3
10 10
20 4
70 7
---OUTPUT---
1
0
4
**/

import java.util.Scanner;

public class CREDcoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int k = sc.nextInt();

            if((m*k) >= 100){
                System.out.println((m*k)/100);
            } else System.out.println(0);
        }
    }
}

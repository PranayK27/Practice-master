package CodeChef.Problems.Difficulty500to1000;
/*
Chef and Profits
Some time ago, Chef bought
X
X stocks at the cost of Rs.
Y
Y each. Today, Chef is going to sell all these
X
X stocks at Rs.
Z
Z each. What is Chef's total profit after he sells them?

Chef's profit equals the total amount he received by selling the stocks, minus the total amount he spent buying them.

Input Format
The first line of input contains an integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains three space-separated integers
X
,
Y
X,Y and
Z
Z — the number of stocks, the price they were bought at, and the price they can be sold at, respectively.
Output Format
For each test case print on a new line a single integer — Chef's profit after selling all the stocks he has.

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
1
0
4
1≤X,Y≤10
4

Y
≤
Z
≤
1
0
4
Y≤Z≤10
4

---Input---
3
2 5 20
3 1 2
4 5 6
---Output---
30
3
4
**/

import java.util.Scanner;

public class ChefAndProfits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println((x * z) - (x * y));
        }
    }
}

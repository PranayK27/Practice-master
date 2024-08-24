package CodeChef.Problems.Difficulty500to1000;

/*
Sugarcane Juice Business
While Alice was drinking sugarcane juice, she started wondering about the following facts:

The juicer sells each glass of sugarcane juice for
50
50 coins.
He spends
20
%
20% of his total income on buying sugarcane.
He spends
20
%
20% of his total income on buying salt and mint leaves.
He spends
30
%
30% of his total income on shop rent.
Alice wonders, what is the juicer's profit (in coins) when he sells
N
N glasses of sugarcane juice?

Input Format
The first line of input will contain an integer
T
T — the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains an integer
N
N, as described in the problem statement.
Output Format
For each test case, output on a new line the juicer's profit when he sells
N
N glasses of juice.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
1
0
6
1≤N≤10
6

---Input---
4
2
4
5
10
---Output---
30
60
75
150
**/

import java.util.Scanner;

public class SugarcaneJuiceBusiness {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int i = 50 * n;
            System.out.println((int)(i-((0.2*i)+(0.2*i)+(0.3*i))));
        }
    }
}

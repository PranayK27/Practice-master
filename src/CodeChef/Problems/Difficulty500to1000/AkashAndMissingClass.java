package CodeChef.Problems.Difficulty500to1000;
/*
Akash and Missing Class
Akash loves going to school, but not on weekends.

A week consists of
7
7 days (Monday to Sunday). Akash takes a leave every Saturday.

If a month consists of
N
N days and the first-day of the month is Monday, find the number of days Akash would take a leave in the whole month.

Input Format
First line will contain
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, one integer
N
N - the number of days in the month.
Output Format
For each test case, output in a single line, the number of days Akash would take a leave in the whole month.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
1
0
9
1≤N≤10
9

---Input---
4
5
6
8
22
---Output---
0
1
1
3
**/


import java.util.Scanner;

public class AkashAndMissingClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n < 6) {
                System.out.println(0);
            }
            else {
                System.out.println(n / 7 + (n % 7 >= 6 ? 1 : 0));
            }
        }
    }
}

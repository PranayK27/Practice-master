package CodeChef.Problems.Difficulty500to1000;
/*
Candy Distribution
Chef has
N
N candies. He has to distribute them to exactly
M
M of his friends such that each friend gets equal number of candies and each friend gets even number of candies. Determine whether it is possible to do so.

NOTE: Chef will not take any candies himself and will distribute all the candies.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers
N
N and
M
M, the number of candies and the number of friends.
Output Format
For each test case, the output will consist of a single line containing Yes if Chef can distribute the candies as per the conditions and No otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).

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
,
M
≤
1000
1≤N,M≤1000

---Input---
4
9 3
4 1
4 2
8 3
822 2
---Output---
No
Yes
Yes
No
No
**/

import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n % 2) == 0 && (n % m) == 0 && (n / m) % 2 == 0) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}

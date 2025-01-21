package CodeChef.Problems.Difficulty500to1000;

/*
Chef Fantasy 11
All of Chef's friends are playing fantasy cricket based upon the ODI World Cup, and Chef would like to join them.

For a certain cricket match, Chef has decided upon his team of
11
11 players. However, he hasn't yet decided who should be the captain and who should be the vice-captain.

He's narrowed his decision down to
N
N players out of the
11
11, from which he'll choose one to be the captain and one to be the vice captain.
How many different choices does he have?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first and the only line of each testcase contains a single integer
N
N, the number of players Chef is considering.
Output Format
For each test case, output on a new line the number of possible choices of captain and vice-captain.

Constraints
1
≤
T
≤
10
1≤T≤10
2
≤
N
≤
11
2≤N≤11

---Input---
2
2
3
4
---Output---
2
6
12
**/

import java.util.Scanner;

public class ChefFantasy11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            System.out.println(n*(n-1));
        }
    }
}

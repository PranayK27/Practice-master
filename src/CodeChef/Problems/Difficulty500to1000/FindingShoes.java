package CodeChef.Problems.Difficulty500to1000;

/*
Finding Shoes
Chef has
N
N friends. Chef promised that he would gift a pair of shoes (consisting of one left shoe and one right shoe) to each of his
N
N friends. Chef was about to go to the marketplace to buy shoes, but he suddenly remembers that he already had
M
M left shoes.

What is the minimum number of extra shoes that Chef will have to buy to ensure that he is able to gift a pair of shoes to each of his
N
N friends?

For example, if
N
=
2
N=2,
M
=
4
M=4, then Chef already has
4
4 left shoes, so he must buy
2
2 extra right shoes to form
2
2 pairs of shoes.

Therefore Chef must buy at least
2
2 extra shoes to ensure that he is able to get
N
=
2
N=2 pairs of shoes.

Input Format
The first line contains a single integer
T
T - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers
N
N and
M
M - the number of Chef's friends and the number of left shoes Chef has.
Output Format
For each test case, output the minimum number of extra shoes that Chef will have to buy to ensure that he is able to get
N
N pairs of shoes.

Constraints
1≤T≤100
1≤N≤100
0≤M≤100

---Input---
3
2 4
6 0
4 3
---Output---
2
12
5

**/

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n <= m){
                System.out.println(n);
            } else if(n>m){
                System.out.println((n*2)-m);
            }
        }
    }
}

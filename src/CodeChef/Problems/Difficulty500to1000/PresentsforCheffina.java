package CodeChef.Problems.Difficulty500to1000;

import java.util.Scanner;

/*
Presents for Cheffina
Chef has fallen in love with Cheffina, and wants to buy
N
N gifts for her. On reaching the gift shop, Chef got to know the following two things:

The cost of each gift is
1
1 coin.
On the purchase of every
4
t
h
4
th
  gift, Chef gets the
5
t
h
5
th
  gift free of cost.
What is the minimum number of coins that Chef will require in order to come out of the shop carrying
N
N gifts?

Input Format
The first line of input will contain an integer
T
T — the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains an integer
N
N, the number of gifts in the shop.
Output Format
For each test case, output on a new line the minimum number of coins that Chef will require to obtain all
N
N gifts.

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
9
1≤N≤10
9

---Input---
2
5
4
---Output---
4
4
**/
public class PresentsforCheffina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            if (n < 5) {
                System.out.println(n);
            } else if (n == 5 || n / 5 == 1) {
                System.out.println(n - 1);
            } else if (n > 5) {
                System.out.println(n - (n / 5));
            }
        }
    }
}

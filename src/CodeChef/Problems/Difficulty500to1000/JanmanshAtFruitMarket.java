package CodeChef.Problems.Difficulty500to1000;
/*
Janmansh at Fruit Market
Janmansh is at the fruit market to buy fruits for Chingari. There is an infinite supply of three different kinds of fruits with prices
A
A,
B
B and
C
C.

He needs to buy a total of
X
X fruits having at least
2
2 different kinds of fruits. What is the least amount of money he can spend to buy fruits?

Input Format
The first line of the input contains a single integer
T
T - the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains four space separated integers
X
X,
A
A,
B
B,
C
C - the number of fruits to buy and the prices of the three different types of fruits respectively.
Output Format
For each test case, output the least amount of money he can spend to buy fruits.

Constraints
1
≤
T
≤
1
0
5
1≤T≤10
5

2
≤
X
≤
1000
2≤X≤1000
1
≤
A
,
B
,
C
≤
100
1≤A,B,C≤100

---Input---
2
2 1 1 1
3 4 3 2
---Output---
2
7
**/


import java.util.Arrays;
import java.util.Scanner;

public class JanmanshAtFruitMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int[] a=new int[3];
            for (int i=0; i<3; i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int calc=(x-1)*a[0]+a[1];
            System.out.println(calc);
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;
/*
Chef and Pairing Slippers
Read problem statements in Mandarin, Bengali, and Russian as well.
Chef has
N
N slippers,
L
L of which are left slippers and the rest are right slippers. Slippers must always be sold in pairs, where each pair contains one left and one right slipper. If each pair of slippers cost
X
X rupees, what is the maximum amount of rupees that Chef can get for these slippers?

Input Format
The first line contains
T
T - the number of test cases. Then the test cases follow.
The first line of each test case contains three space-separated integers
N
N,
L
L, and
X
X - the total number of slippers, the number of left slippers, and the price of a pair of slippers in rupees.
Output Format
For each test case, output on one line the maximum amount of rupees that Chef can get by selling the slippers that are available.

Constraints
1
≤
T
≤
1
0
3
1≤T≤10
3

0
≤
L
≤
N
≤
1
0
3
0≤L≤N≤10
3

0
≤
X
≤
1
0
3
0≤X≤10
3

---Input---
4
0 0 100
10 1 0
1000 10 1000
10 7 1
---Output---
0
0
10000
3
**/


import java.util.Scanner;

public class ChefAndPairingSlippers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int x = sc.nextInt();
            if(n==0 || x==0){
                System.out.println(0);
            } else if(l>n/2){
                System.out.println((n-l)*x);
            } else {
                System.out.println(l*x);
            }
        }
    }
}

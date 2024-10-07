package CodeChef.Problems.Difficulty500to1000;

/*
Chef and Water Bottles
Chef has
N
N empty bottles where each bottle has a capacity of
X
X litres.
There is a water tank in Chefland having
K
K litres of water. Chef wants to fill the empty bottles using the water in the tank.

Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers
N
,
X
,
N,X, and
K
K.
Output Format
For each test case, output in a single line answer, the maximum number of bottles Chef can fill completely.

Constraints
1≤T≤100
1≤N,X≤10^5
0≤K≤10^5

---Input---
3
5 2 8
10 5 4
3 1 4
---Output---
4
0
3
**/

import java.util.Scanner;

public class ChefAndWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            if (x <= k) {
                if ((k / x) <= n) {
                    System.out.println((k / x));
                } else System.out.println(n);
            } else System.out.println("0");
        }
    }
}

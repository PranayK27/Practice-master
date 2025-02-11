package CodeChef.Problems.Difficulty500to1000;
/*
Get Lowest Free
Chef goes to the supermarket to buy some items. Luckily there's a sale going on under which Chef gets the following offer:

If Chef buys
3
3 items then he gets the item (out of those
3
3 items) having the lowest price as free.
For e.g. if Chef bought
3
3 items with the cost
6
6,
2
2 and
4
4, then he would get the item with cost
2
2 as free. So he would only have to pay the cost of the other two items which will be
6
+
4
=
10
6+4=10.

Chef buys
3
3 items having prices
A
A,
B
B and
C
C respectively. What is the amount of money Chef needs to pay?

Input Format
The first line will contain an integer
T
T - number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers
A
,
B
,
C
A,B,C - the prices of the items bought by Chef.
Output Format
For each test case, output the price paid by Chef.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
A
,
B
,
C
≤
10
1≤A,B,C≤10

---Input---
3
6 2 4
3 3 3
8 4 4

---Output---
10
6
12
**/

import java.util.Scanner;

public class GetLowestFree {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int total = a+b+c;
            System.out.println(total-findMinimum(a,b,c));

        }

    }
    public static int findMinimum(int A, int B, int C) {
        // Check if A is the smallest
        if (A <= B && A <= C) {
            return A;
        }
        // Check if B is the smallest
        if (B <= A && B <= C) {
            return B;
        }
        // If neither A nor B is the smallest, return C
        return C;
    }
}

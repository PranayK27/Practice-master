package CodeChef.Basic;

import java.util.Scanner;

/*
Problem
Chef has 3 numbers A, B and C.

Chef wonders if it is possible to choose exactly two numbers out of the three numbers such that their sum is odd.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of three integers A, B, C.
Output Format
For each test case, output YES if you can choose exactly two numbers with odd sum, NO otherwise.

The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

Constraints
1≤T≤100
1≤A,B,C≤10
Sample 1:
Input
4
1 2 3
8 4 6
3 3 9
7 8 6
Output
YES
NO
NO
YES
Explanation:
Test case 1: Chef can choose 22 and 33 since 2 + 3 = 5 and 5 is odd.

Test case 2: It can be shown that Chef cannot choose two numbers among 8, 4 and 6 with odd sum.
* */

public class OddSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if((a+b)%2!=0 || (b+c)%2!=0 || (c+a)%2!=0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

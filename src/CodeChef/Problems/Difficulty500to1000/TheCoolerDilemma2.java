package CodeChef.Problems.Difficulty500to1000;
/*
The Cooler Dilemma 2
The summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:

Rent a cooler at the cost of
X
X coins per month.
Purchase a cooler for
Y
Y coins.
Chef wonders what is the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.

Input Format
The first line of input will contain an integer
T
T — the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains two integers
X
X and
Y
Y, as described in the problem statement.
Output Format
For each test case, output the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.

If Chef should not rent a cooler at all, output
0
0.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
X
,
Y
≤
1
0
9
1≤X,Y≤10
9

---Input---
2
5 12
5 5
---Output---
2
0
**/

import java.util.Scanner;

public class TheCoolerDilemma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            int y=sc.nextInt();
            if ( y % x != 0){
                System.out.println(y / x);
            }
            else{
                System.out.println((y/x)-1);
            }
        }
    }
}

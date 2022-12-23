package CodeChef.Basic;

import java.util.Scanner;

/*
Problem
Summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:

Rent a cooler at the cost of X coins per month.
Purchase a cooler for Y coins.
Given that the summer season will last for M months in Chefland, help Chef in finding whether he should rent the cooler or not.

Chef rents the cooler only if the cost of renting the cooler is strictly less than the cost of purchasing it. Otherwise, he purchases the cooler.

Print YES if Chef should rent the cooler, otherwise print NO.

Input Format
The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains three integers X, Y and M, as described in the problem statement.
Output Format
For each test case, output YES if Chef should rent the cooler, otherwise output \NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

Constraints
1≤T≤100
1≤X,M≤10^4
1≤Y≤10^8

Sample 1:
Input
3
5 10 1
5 10 2
5 10 3
Output
YES
NO
NO
Explanation:
Test case 1: Cost of renting the cooler = 5 coins. Cost of purchasing the cooler = 10 coins. So, Chef should rent the cooler as the cost of renting the cooler for 1 month is strictly less than purchasing it.

Test case 2: Cost of renting the cooler = 10 coins. Cost of purchasing the cooler = 10 coins. So, Chef should not rent the cooler as the cost of renting the cooler for 2 months is not strictly less than purchasing it.

Test case 3: Cost of renting the cooler = 15 coins. Cost of purchasing the cooler = 10 coins. So, Chef should not rent the cooler as the cost of renting the cooler for 3 months is not strictly less than purchasing it.


* */

public class TheCoolerDilemma1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int rent = sc.nextInt();
            int purchase = sc.nextInt();

            int months = sc.nextInt();

            if(purchase<=(rent*months)){
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }
        }
    }
}

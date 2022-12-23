package CodeChef.Bronze;

import java.util.Scanner;

/*
Problem
Chef is the financial incharge of Chefland and one of his duties is identifying if any company has gained a monopolistic advantage in the market.

There are exactly 33 companies in the market each of whose revenues are denoted by R1, R2 and R3 respectively.
A company is said to have a monopolistic advantage if its revenue is strictly greater than the sum of the revenues of its competitors.

Given the revenue of the 3 companies, help Chef determine if any of them has a monopolistic advantage.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line of input containing three space separated integers,
R1, R2 and R3 denoting the revenue of the three companies respectively.

Output Format
For each test case, output YES if any of the companies has a monopolistic advantage over its competitors, else output NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

Constraints
1≤T≤1000
1 ≤ R1, R2, R3 ≤ 10

Sample 1:
Input
4
1 1 1
1 2 4
2 10 3
1 2 3
Output
No
Yes
Yes
No
Explanation:
Test case 1: All the companies have equal revenue so none have a monopolistic advantage.

Test case 2: The third company has a monopolistic advantage as 1+2<4.

Test case 3: The second company has a monopolistic advantage as 2+3<10.
* */

public class MonopolyInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a>(b+c) || b>(a+c) || c>(a+b)){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}

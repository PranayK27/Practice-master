package CodeChef.Bronze;

import java.util.Scanner;

/*
Problem
Chef has invested his money at an interest rate of X percent per annum while the current inflation rate is Y percent per annum.

An investment is called good if and only if the interest rate of the investment is at least twice of the inflation rate.
Determine whether the investment made by Chef is good or not.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two integers X and Y, the interest rate and the current inflation rate respectively.
Output Format
For each test case, output YES if the investment is good, NO otherwise.

You can output any letter in any case. For example YES, yes, yES are all considered same.

Constraints
1 \leq T \leq 4001≤T≤400
1 \leq X, Y \leq 201≤X,Y≤20
Sample 1:
Input
5
7 4
6 3
2 4
10 10
20 1
Output
NO
YES
NO
NO
YES
Explanation:
Test case 1: The interest rate is 7 and the current inflation rate is 4. Since the interest rate is less than twice of current inflation rate, the investment is not good.

Test case 2: The interest rate is 6 and the current inflation rate is 3. Since the interest rate is equal to twice of current inflation rate, the investment is good.

Test case 3: The interest rate is 2 and the current inflation rate is 4. Since the interest rate is less than twice of current inflation rate, the investment is not good.

Test case 4: The interest rate is 10 and the current inflation rate is 10. Since the interest rate is less than twice of current inflation rate, the investment is not good.

Test case 5: The interest rate is 20 and the current inflation rate is 1. Since the interest rate is greater than twice of current inflation rate, the investment is good.
* */

public class GoodInvestmentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int interestRate = sc.nextInt();
            int inflationRate = sc.nextInt();

            if(interestRate>=(inflationRate*2)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}

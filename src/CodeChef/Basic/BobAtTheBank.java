package CodeChef.Basic;

import java.util.Scanner;

/*
Problem
Bob has an account in the Bobby Bank. His current account balance is W rupees.

Each month, the office in which Bob works deposits a fixed amount of X rupees to his account.
YY rupees is deducted from Bob's account each month as bank charges.

Find his final account balance after Z months. Note that the account balance can be negative as well.

Input Format
The first line will contain T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing four integers W,X,Y, and Z — the initial amount, the amount deposited per month, the amount deducted per month, and the number of months.
Output Format
For each test case, output in a single line the final balance in Bob's account after Z months.

Constraints
1≤T≤1000
1≤W,X,Y,Z≤10^4

Sample 1:
Input
3
100 11 1 10
999 25 36 9
2500 100 125 101
Output
200
900
-25
Explanation:
Test case 1: Bob's current account balance is 100. At the end of each month Bob gets Rs 11 and pays Rs 1, thus gaining 10 per month. Thus, at the end of 1010 months, Bob will have 100+10×10=200.

Test case 2: Bob's current account balance is 999. At the end of each month Bob gets Rs 25 and pays Rs 36, thus losing 11 per month. Thus, at the end of 99 months, Bob will have 999−11×9=900.

Test case 3: Bob's current account balance is 2500. At the end of each month Bob gets Rs 100 and pays Rs 125, thus losing 25 per month. Thus, at the end of 101101 months, Bob will have 2500−25×101=−25.


* */

public class BobAtTheBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int amt=sc.nextInt();
            int inc=sc.nextInt();

            int dec=sc.nextInt();
            int mon=sc.nextInt();

            int curr = amt + (inc*mon) - (dec*mon);
            System.out.println(curr);

        }
    }
}

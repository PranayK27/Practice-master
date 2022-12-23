package CodeChef.Bronze;

import java.util.Scanner;

/** Problem */
/**
* Alice, Bob and Charlie are bidding for an artifact at an auction.
Alice bids AA rupees, Bob bids BB rupees, and Charlie bids CC rupees (where AA, BB, and CC are distinct).

According to the rules of the auction, the person who bids the highest amount will win the auction.
Determine who will win the auction.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers AA, BB, and CC, — the amount bid by Alice, Bob, and Charlie respectively.
Output Format
For each test case, output who (out of Alice, Bob, and Charlie) will win the auction.

You may print each character of Alice, Bob, and Charlie in uppercase or lowercase (for example, ALICE, aliCe, aLIcE will be considered identical).

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq A, B, C \leq 10001≤A,B,C≤1000
AA, BB, and CC are distinct.
Sample 1:
* Input
4
200 100 400
155 1000 566
736 234 470
124 67 2
* Output
Charlie
Bob
Alice
Alice
*
Explanation:
Test Case 1: Charlie wins the auction since he bid the highest amount.

Test Case 2: Bob wins the auction since he bid the highest amount.

Test Case 3: Alice wins the auction since she bid the highest amount.

Test Case 4: Alice wins the auction since she bid the highest amount.
* */

public class Bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a>b && a>c){
                System.out.println("Alice");
            } else if(b>a && b>c){
                System.out.println("Bob");
            } else if(c>a && c>b){
                System.out.println("Charlie");
            }
        }
    }
}

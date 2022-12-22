package CodeChef.Basic;

import java.util.Scanner;

/** Problem */
/**
* Alice and Bob are very good friends and they always distribute all the eatables equally among themselves.

Alice has AA chocolates and Bob has BB chocolates. Determine whether Alice and Bob can distribute all the chocolates equally among themselves.

Note that:

It is not allowed to break a chocolate into more than one piece.
No chocolate shall be left in the distribution.
Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains two space-separated integers AA and BB, the number of chocolates that Alice and Bob have, respectively.
Output Format
For each test case, output on a new line \texttt{YES}YES if Alice and Bob can distribute all the chocolates equally, else output \texttt{NO}NO. The output is case insensitive, i.e, \texttt{yes}yes, \texttt{YeS}YeS, \texttt{yES}yES will all be accepted as correct answers when Alice and Bob can distribute the chocolates equally.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq A, B \leq 10^51≤A,B≤10
5

Sample 1:
* Input
4
1 1
1 3
1 2
1 4
* Output
YES
YES
NO
NO
Explanation:
Test case 1: Both Alice and Bob already have equal number of chocolates, hence it is possible to distribute the chocolates equally among Alice and Bob.

Test case 2: If Bob gives one of his chocolates to Alice, then both of them will have equal number of chocolates, i.e. 2. So, it is possible to distribute the chocolates equally among Alice and Bob.

Test case 3: There are total 3 chocolates. These chocolates cannot be divided equally among Alice and Bob.

Test case 4: Alice and Bob cannot have equal number of chocolates, no matter how they distribute the chocolates.
* */

public class EqualDistribution {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int x=0; x<T; x++){
            int a= sc.nextInt();
            int b= sc.nextInt();

            if(a==b){
                System.out.println("YES");
            } else if((a+b)%2 == 0){
                System.out.println("YES");
            } else if((a+b)%2 != 0){
                System.out.println("NO");
            }
        }
    }
}

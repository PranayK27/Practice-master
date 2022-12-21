package CodeChef.Self;

import java.util.Scanner;

/*
Problem
Chef wants to give a burger party to all his N friends i.e. he wants to buy one burger for each of his friends.

The cost of each burger is X rupees while Chef has a total of K rupees.

Determine whether he has enough money to buy a burger for each of his friends or not.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains the three integers N, X, and K - the number of Chef's friends, the cost of each burger, and the total money Chef has, respectively.
Output Format
For each test case, output YES if the Chef can give a party to all his N friends. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1 \le T \le 10001≤T≤1000
1 \le N, X \le 1001≤N,X≤100
1 \le K \le 100001≤K≤10000
Sample 1:
Input
4
5 10 70
5 10 40
10 40 400
14 14 150
Output
YES
NO
YES
NO
Explanation:
Test case 1: Chef has 5 friends. The cost of buying a burger for each of them will be 10 \times 5, 10×5=50 while Chef has 70 rupees. Therefore, he can buy a burger for all of them.

Test case 2: Chef has 5 friends. The cost of buying a burger for each of them will be 10 \times 5, 10×5=50 while Chef has 40 rupees. Therefore, he can not buy a burger for all of them.

Test case 3: Chef has 10 friends. The cost of buying a burger for each of them will be 40 \times 10, 40×10=400 and Chef has 400 rupees. Therefore, he can buy a burger for all of them.

Test case 4: Chef has 14 friends. The cost of buying a burger for each of them will be 14 \times 14, 14×14=196 while Chef has 150 rupees. Therefore, he can not buy a burger for all of them.
* */

public class ChefGivesParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int numOfFriends=sc.nextInt();
            int costOfOneBurger=sc.nextInt();
            int moneyInHand=sc.nextInt();

            if(moneyInHand>=(numOfFriends*costOfOneBurger)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

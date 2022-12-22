package CodeChef.Basic;

import java.util.Scanner;
/*
* Problem
The working hours of Chef’s kitchen are from XX pm to YY pm (1 \le X \lt Y \le 12)(1≤X<Y≤12).

Find the number of hours Chef works.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of two space-separated integers XX and YY — the starting and ending time of working hours respectively.
Output Format
For each test case, output on a new line, the number of hours Chef works.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X \lt Y \leq 121≤X<Y≤12
Sample 1:
Input
4
1 2
3 7
9 11
2 10
Output
1
4
2
8
Explanation:
Test case 1: Chef starts working at 1 pm and works till 2 pm. Thus, he works for 1 hour.

Test case 2: Chef starts working at 3 pm and works till 7 pm. Thus, he works for 4 hours.

Test case 3: Chef starts working at 9 pm and works till 11 pm. Thus, he works for 2 hours.

Test case 4: Chef starts working at 2 pm and works till 10 pm. Thus, he works for 8 hours.
* */

public class KitchenTimings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
                int start=sc.nextInt();
                int stop=sc.nextInt();
                int shift=stop-start;
                System.out.println(shift);
        }
    }
}

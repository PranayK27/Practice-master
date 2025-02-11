package CodeChef.Problems.Difficulty500to1000;

/*
Dracula Eats
Eat, drink, and be scary

There are
N
N spooky days left until Halloween.
Dracula dines at a mysterious restaurant that changes its spooky menu daily. He particularly enjoys what they serve on Tuesday.

Today is Monday, so he wishes to calculate how many times he can indulge in his favourite menu in the next
N
N days (including today) before Halloween.

Note that Dracula follows the standard
7
7-day calendar, with Tuesday immediately following Monday.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The only line of each test case contains a single integer
N
N, denoting the number of spooky days.
Output Format
For each test case, output on a new line the number of times Dracula would have had his favorite meal after
N
N days.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
1000
1≤N≤1000

---Input---
4
1
10
15
16
---Output---
0
2
2
3
**/

import java.util.Scanner;

public class DracularEats {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int ans = 0;
            if (n < 2) {
                System.out.println("0");
            }
            else {
                for (int i = 2; i <= n; i += 7) {
                    ans++;
                }
                System.out.println(ans);
            }
        }

    }
}

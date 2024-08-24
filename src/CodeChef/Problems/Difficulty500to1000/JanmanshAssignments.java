package CodeChef.Problems.Difficulty500to1000;

/*
Janmansh and Assignments
Janmansh has to submit
3
3 assignments for Chingari before
10
10 pm and he starts to do the assignments at
X
X pm. Each assignment takes him
1
1 hour to complete. Can you tell whether he'll be able to complete all assignments on time or not?

Input Format
The first line will contain
T
T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer
X
X - the time when Janmansh starts doing the assignments.
Output Format
For each test case, output Yes if he can complete the assignments on time. Otherwise, output No.

You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).

Constraints
1
≤
T
≤
10
1≤T≤10
1
≤
X
≤
9
1≤X≤9


---Input---
2
7
9
---Output---
Yes
No
**/


import java.util.Scanner;

public class JanmanshAssignments {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if(x+3 <= 10){
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;

/*
Greater Average
You are given
3
3 numbers
A
,
B
,
A,B, and
C
C.

Determine whether the average of
A
A and
B
B is strictly greater than
C
C or not?

NOTE: Average of
A
A and
B
B is defined as
(
A
+
B
)
2
2
(A+B)
​
 . For example, average of
5
5 and
9
9 is
7
7, average of
5
5 and
8
8 is
6.5
6.5.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of
3
3 integers
A
,
B
,
A,B, and
C
C.
Output Format
For each test case, output YES if average of
A
A and
B
B is strictly greater than
C
C, NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
A
,
B
,
C
≤
10
1≤A,B,C≤10

--- Input ---
5
5 9 6
5 8 6
5 7 6
4 9 8
3 7 2
--- Output ---
YES
YES
NO
NO
YES
**/

import java.util.Scanner;

public class GreaterAverage {
    public static void main (String[] args) throws java.lang.Exception
    {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-->0){
            float a=sc.nextInt();
            float b=sc.nextInt();
            float c=sc.nextInt();

            if((a+b)/2 > c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

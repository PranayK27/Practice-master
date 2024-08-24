package CodeChef.Problems.Difficulty500to1000;

/*
Monopoly
There are
4
4 companies in the markets of Chefland,
A
A,
B
B,
C
C, and
D
D.
This year,

Company
A
A made a profit of
P
P lakh rupees,
Company
B
B made a profit of
Q
Q lakh rupees,
Company
C
C made a profit of
R
R lakh rupees,
Company
D
D made a profit of
S
S lakh rupees.
There is said to be a monopoly in the market if the profit made by one company is strictly greater than the sum of profits made by all other companies.
Determine if there is a monopoly in the market or not.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first line and only line of each test case contains four space-separated integers
P
P,
Q
Q,
R
R and
S
S — the profits made by companies
A
A,
B
B,
C
C and
D
D respectively.
Output Format
For each test case, output YES if there is a monopoly in the market. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1
≤
T
≤
5000
1≤T≤5000
1
≤
P
,
Q
,
R
,
S
≤
100
1≤P,Q,R,S≤100

---Input---
4
1 1 1 10
30 20 6 4
100 90 3 4
14 15 16 17
---Output---
YES
NO
YES
NO
**/

import java.util.Scanner;

public class Monopoly {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();

            if((p+q+r)<s || (q+r+s)<p || (r+s+p)<q || (s+p+q)<r){
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}

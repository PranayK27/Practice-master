package CodeChef.Problems.Difficulty500to1000;

/*
Expert Setter
A problem setter is called an expert if at least
50
%
50% of their problems are approved by Chef.

Munchy submitted
X
X problems for approval. If
Y
Y problems out of those were approved, find whether Munchy is an expert or not.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a two space-separated integers
X
X and
Y
Y - the number of problems submitted and the number of problems that were approved by Chef.
Output Format
For each test case, output on a new line YES, if Munchy is an expert. Otherwise, print NO.

The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
Y
≤
X
≤
1
0
6
1≤Y≤X≤10
6

--- Input---
4
5 3
1 1
4 1
2 1
--Output---
YES
YES
NO
YES
**/

import java.util.Scanner;

public class ExpertSetter {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float x = sc.nextInt();
            float y = sc.nextInt();

            if((y/x)*100 >= 50){
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;

/*
Bath in Winters
A geyser has a capacity of
X
X litres of water and a bucket has a capacity of
Y
Y litres of water.

One person requires exactly
2
2 buckets of water to take a bath. Find the maximum number of people that can take bath using water from one completely filled geyser..

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers
X
,
Y
X,Y.
Output Format
For each test case, output the maximum number of people that can take bath.

Constraints
1≤T≤1000
1≤X,Y≤100

---Input---
4
10 6
25 1
100 10
30 40
---Output---
0
12
5
0
**/

import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int yy=y*2;
            if (y<=(x/2)){
                System.out.println(x/yy);
            } else System.out.println(0);
        }
    }
}

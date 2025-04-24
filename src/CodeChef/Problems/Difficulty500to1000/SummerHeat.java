package CodeChef.Problems.Difficulty500to1000;

import java.util.Scanner;

/*
Summer Heat
Read problem statements in Vietnamese,
Bengali, Mandarin Chinese, and Russian as well.

Chefland has
2
2 different types of coconut, type
A
A and type
B
B. Type
A
A contains only
x
a
x
a
​
  milliliters of coconut water and type
B
B contains only
x
b
x
b
​
  grams of coconut pulp. Chef's nutritionist has advised him to consume
X
a
X
a
​
  milliliters of coconut water and
X
b
X
b
​
  grams of coconut pulp every week in the summer. Find the total number of coconuts (type
A
A + type
B
B) that Chef should buy each week to keep himself active in the hot weather.

Input Format
The first line contains an integer
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, four integers
x
a
x
a
​
 ,
x
b
x
b
​
 ,
X
a
X
a
​
 ,
X
b
X
b
​
 .
Output Format
For each test case, output in a single line the answer to the problem.

Constraints
1
≤
T
≤
15000
1≤T≤15000
100
≤
x
a
≤
200
100≤x
a
​
 ≤200
400
≤
x
b
≤
500
400≤x
b
​
 ≤500
1000
≤
X
a
≤
1200
1000≤X
a
​
 ≤1200
1000
≤
X
b
≤
1500
1000≤X
b
​
 ≤1500
x
a
x
a
​
  divides
X
a
X
a
​
 .
x
b
x
b
​
  divides
X
b
X
b
​
 .
Subtasks
Subtask #1 (100 points): original constraints

---Input---
3
100 400 1000 1200
100 450 1000 1350
150 400 1200 1200

---Output---
13
13
11

**/
public class SummerHeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            System.out.println((Xa/xa)+(Xb/xb));
        }
    }
}

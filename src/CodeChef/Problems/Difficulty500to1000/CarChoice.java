package CodeChef.Problems.Difficulty500to1000;
/*
Car Choice
Chef is planning to buy a new car for his birthday. After a long search, he is left with
2
2 choices:

Car 1: Runs on diesel with a fuel economy of
x
1
x
1
​
  km/l
Car 2: Runs on petrol with a fuel economy of
x
2
x
2
​
  km/l
Chef also knows that

the current price of diesel is
y
1
y
1
​
  rupees per litre
the current price of petrol is
y
2
y
2
​
  rupees per litre
Assuming that both cars cost the same and that the price of fuel remains constant, which car will minimize Chef's expenses?

Print your answer as a single integer in the following format

If it is better to choose Car 1, print
−
1
−1
If both the cars will result in the same expenses, print
0
0
If it is better to choose Car 2, print
1
1
Input Format
The first line of input contains a single integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
Each test case consists of a single line containing
4
4 space-separated integers —
x
1
,
x
2
,
y
1
,
y
2
x
1
​
 ,x
2
​
 ,y
1
​
 ,y
2
​
 .
Output Format
For each test case, output in a single line the answer as explained earlier.

Constraints
1
≤
T
≤
10000
1≤T≤10000
1
≤
x
1
,
x
2
,
y
1
,
y
2
≤
50
1≤x
1
​
 ,x
2
​
 ,y
1
​
 ,y
2
​
 ≤50

---Input---
3
10 5 3 20
7 2 7 2
1 5 3 2
---Output---
-1
0
1
**/

import java.util.Scanner;

public class CarChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            float x1 = sc.nextInt();
            float x2 = sc.nextInt();

            float y1 = sc.nextInt();
            float y2 = sc.nextInt();

            float exp1 = y1/x1;
            float exp2 = y2/x2;
            if (exp1 > exp2){
                System.out.println(1);
            } else if(exp1 < exp2){
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }

    }
}

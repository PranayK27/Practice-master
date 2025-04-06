package CodeChef.Problems.Difficulty500to1000;
/*
Equal Integers
Chef has two integers
X
X and
Y
Y. Chef wants to perform some operations to make
X
X and
Y
Y equal. In one operation, Chef can either:

set
X
:
=
X
+
1
X:=X+1
or set
Y
:
=
Y
+
2
Y:=Y+2
Find the minimum number of operations required to make
X
X and
Y
Y equal.

Input Format
The first line contains a single integer
T
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space separated integers
X
X and
Y
Y.
Output Format
For each test case, print the minimum number of operations required to make
X
X and
Y
Y equal.

Constraints
1
≤
T
≤
1
0
4
1≤T≤10
4

1
≤
X
,
Y
≤
1
0
9
1≤X,Y≤10
9

---Input---
5
3 4
5 5
7 3
5 2
7 12

-- Special test cases --
10
1 5
5 1
3 10
5 8
12 20
11 11
1 4
6 6
100 101
100 500

---Output---
1
0
2
3
5

-- Special test results --
4
2
7
3
8
0
3
0
1
400

**/


import java.util.Scanner;

public class EqualIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y > x)
            {
                System.out.println(y - x);
            }
            else if ((x - y) % 2 == 0)
            {
                System.out.println((x - y) / 2);
            }
            else
            {
                System.out.println(2 + (x - y) / 2);
            }
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;
/*
Degree of Polynomial
In mathematics, the degree of polynomials in one variable is the highest power of the variable in the algebraic expression with non-zero coefficient.

Chef has a polynomial in one variable
x
x with
N
N terms. The polynomial looks like
A
0
⋅
x
0
+
A
1
⋅
x
1
+
…
+
A
N
−
2
⋅
x
N
−
2
+
A
N
−
1
⋅
x
N
−
1
A
0
​
 ⋅x
0
 +A
1
​
 ⋅x
1
 +…+A
N−2
​
 ⋅x
N−2
 +A
N−1
​
 ⋅x
N−1
  where
A
i
−
1
A
i−1
​
  denotes the coefficient of the
i
t
h
i
th
  term
x
i
−
1
x
i−1
  for all
(
1
≤
i
≤
N
)
(1≤i≤N).

Find the degree of the polynomial.

Note: It is guaranteed that there exists at least one term with non-zero coefficient.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
First line of each test case contains of a single integer
N
N - the number of terms in the polynomial.
Second line of each test case contains of
N
N space-separated integers - the
i
t
h
i
th
  integer
A
i
−
1
A
i−1
​
  corresponds to the coefficient of
x
i
−
1
x
i−1
 .
Output Format
For each test case, output in a single line, the degree of the polynomial.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
1000
1≤N≤1000
−
1000
≤
A
i
≤
1000
−1000≤A
i
​
 ≤1000
A
i
≠
0
A
i
​
 =0 for at least one
(
0
≤
i
<
N
)
(0≤i<N).


---Input---
4
1
5
2
-3 3
3
0 0 5
4
1 2 4 0
---Output---
0
1
2
2
**/


import java.util.Scanner;

public class DegreeOfPolynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int a = sc.nextInt();
            int[] b = new int[a];
            int degree = 0;
            for (int i = 0; i < a; i++) {
                b[i] = sc.nextInt();
                if (b[i] !=0){
                    degree = i;
                }
            }
            System.out.println(degree);
        }

    }
}

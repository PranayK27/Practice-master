package CodeChef.Problems.Difficulty500to1000;
/*
First and Last
You are given an array
A
=
[
A
1
,
A
2
,
…
,
A
N
]
A=[A
1
​
 ,A
2
​
 ,…,A
N
​
 ] of length
N
N.

You can right rotate it any number of times (possibly, zero). What is the maximum value of
A
1
+
A
N
A
1
​
 +A
N
​
  you can get?

Note: Right rotating the array
[
A
1
,
A
2
,
…
,
A
N
]
[A
1
​
 ,A
2
​
 ,…,A
N
​
 ] once gives the array
[
A
N
,
A
1
,
A
2
,
…
,
A
N
−
1
]
[A
N
​
 ,A
1
​
 ,A
2
​
 ,…,A
N−1
​
 ]. For example, right rotating
[
1
,
2
,
3
]
[1,2,3] once gives
[
3
,
1
,
2
]
[3,1,2], and right rotating it again gives
[
2
,
3
,
1
]
[2,3,1].

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases. The description of the test cases follows.
The first line of each test case contains a single integer
N
N, denoting the length of array
A
A.
The second line of each test case contains
N
N space-separated integers
A
1
,
A
2
,
…
,
A
N
A
1
​
 ,A
2
​
 ,…,A
N
​
  — denoting the array
A
A.
Output Format
For each test case, output on a new line the maximum value of
A
1
+
A
N
A
1
​
 +A
N
​
  you can get after several right rotations.

Constraints
1
≤
T
≤
1000
1≤T≤1000
2
≤
N
≤
1
0
5
2≤N≤10
5

1
≤
A
i
≤
1
0
9
1≤A
i
​
 ≤10
9

The sum of
N
N across all test cases does not exceed
1
0
5
10
5

---Input---
3
2
5 8
3
5 10 15
4
4 4 4 4
---Output---
13
25
8
**/


import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0] + arr[n-1];
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                int temp = arr[i] + arr[i+1];
                if(temp>sum){
                    sum = temp;
                }
            }
            System.out.println(Math.max(sum,max));
        }
    }
}

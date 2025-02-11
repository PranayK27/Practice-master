package CodeChef.Problems.Difficulty500to1000;
/*
Minimum number of Flips
Chef has an array
A
A of length
N
N consisting of
1
1 and
−
1
−1 only.

In one operation, Chef can choose any index
i
i
(
1
≤
i
≤
N
)
(1≤i≤N) and multiply the element
A
i
A
i
​
  by
−
1
−1.

Find the minimum number of operations required to make the sum of the array equal to
0
0. Output -1 if the sum of the array cannot be made
0
0.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
First line of each test case consists of a single integer
N
N denoting the length of the array.
Second line of each test case contains
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
  denoting the array
A
A.
Output Format
For each test case, output the minimum number of operations to make the sum of the array equal to
0
0. Output -1 if it is not possible to make the sum equal to
0
0.

Constraints
1
≤
T
≤
100
1≤T≤100
2
≤
N
≤
1000
2≤N≤1000
A
i
=
1
A
i
​
 =1 or
A
i
=
−
1
A
i
​
 =−1

 ---Input---
4
4
1 1 1 1
5
1 -1 1 -1 1
6
1 -1 -1 1 1 1
2
1 -1
 ---Output---
 2
-1
1
0
**/

import java.util.Scanner;

public class MinimumNumberOfFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
           if(sum%2 != 0){
               System.out.println("-1");
           } else {
               System.out.println(Math.abs(sum/2));
           }
        }
    }

}

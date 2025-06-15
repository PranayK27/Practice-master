package CodeChef.Problems.Difficulty500to1000;
/*
Inside The Stadium
Shubman Gill is playing an international match.
He played a total of
N
N balls, where, in the
i
t
h
i
th
  ball, he scored
A
i
A
i
​
  runs.

The strike rate of a player is calculated as :
no. of runs
no. of balls played
×
100
no. of balls played
no. of runs
​
 ×100.

Preet, a math enthusiast, is currently watching the match. Help him find the number of times, Shubman's strike rate became exactly
100
100.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains an integer
N
N - the total number of balls played by Gill.
The second line of each test case contains
N
N space-separated integers where
A
i
A
i
​
  denotes runs scored on
i
t
h
i
th
  ball.
Output Format
For each test case, output on a new line, the total number of times the strike rate of Gill became
100
100.

Constraints
1
≤
T
≤
1
0
5
1≤T≤10
5

1
≤
N
≤
1
0
5
1≤N≤10
5

0
≤
A
i
≤
6
0≤A
i
​
 ≤6
The sum of
N
N over all test cases won't exceed
1
0
6
10
6
 .

 ---Input---
3
4
1 0 2 3
5
2 6 0 1 0
3
1 1 1
---Output---
2
0
3
**/

import java.util.Scanner;

public class InsideTheStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0;
        int total = 0;
        while (t--> 0) {
            int n= sc.nextInt();
            int sum[] = new int[n];
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int sr = 0, count = 0;
            for (int i = 0; i < n; i++)
            {
                sr += arr[i];
                if (sr * 100 == (i + 1) * 100)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

package CodeChef.Problems.Difficulty500to1000;
/*
Group Assignment
Chef's professor is planning to give his class a group assignment. There are
2
N
2N students in the class, with distinct roll numbers ranging from
1
1 to
2
N
2N. Chef's roll number is
X
X.

The professor decided to create
N
N groups of
2
2 students each. The groups were created as follows: the first group consists of roll numbers
1
1 and
2
N
2N, the second group of roll numbers
2
2 and
2
N
−
1
2N−1, and so on, with the final group consisting of roll numbers
N
N and
N
+
1
N+1.

Chef wonders who his partner will be. Can you help Chef by telling him the roll number of his partner?

Input Format
The first line of input will contain an integer
T
T — the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains two integers
N
N and
X
X, denoting the number of groups that will be formed, and Chef's roll number.
Output Format
For each test case, output the roll number of the student that will be Chef's partner.

Constraints
1
≤
T
≤
1
0
3
1≤T≤10
3

1
≤
N
≤
1
0
8
1≤N≤10
8

1
≤
X
≤
2
N
1≤X≤2N

---Input---
3
2 2
3 1
3 4
---Output---
3
6
3
**/

import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            System.out.println(2*n+1-x);
        }
    }
}

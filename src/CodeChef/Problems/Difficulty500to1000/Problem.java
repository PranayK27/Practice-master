package CodeChef.Problems.Difficulty500to1000;
/*
Problem
One less problem without ya
I got one less problem without ya

Alice and Bob are competing in a challenge. Initially Alice has
N
N problems and Bob has
M
M problems.

Each time Alice solves a problem, Bob receives one more problem to solve.
Each time Bob solves a problem, Alice receives three more problems to solve.
Find whether it is possible that both of them have the same number of problems left if they can solve the problems in any arbitrary manner.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case contains two space-separated integers
N
N and
M
M — the initial number of problems of Alice and Bob respectively.
Output Format
For each test case, output on a new line, YES, it is possible that both of them have the same number of problems left if they can solve the problems in any arbitrary manner and NO otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

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
,
M
≤
100
1≤N,M≤100

---Input---
4
4 2
1 5
2 3
2 2
---Output---
YES
YES
NO
YES
**/


import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n%2==m%2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
